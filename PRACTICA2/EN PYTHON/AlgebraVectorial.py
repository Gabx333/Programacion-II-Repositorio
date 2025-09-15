#**
# La Clase: Algebra Vectorial
#
# @author Priscila Gabriela Nina Tito
# @version 1.0 15/09/2025
#
#
import math

class AlgebraVectorial:
    def __init__(self, x=0, y=0, z=0):
        self.x = x
        self.y = y
        self.z = z

    @classmethod
    def from_vector(cls, otro):
        return cls(otro.x, otro.y, otro.z)

    def __add__(self, otro): 
        return AlgebraVectorial(self.x + otro.x, self.y + otro.y, self.z + otro.z)

    def __sub__(self, otro):  
        return AlgebraVectorial(self.x - otro.x, self.y - otro.y, self.z - otro.z)

    def __mul__(self, escalar): 
        if isinstance(escalar, (int, float)):
            return AlgebraVectorial(self.x * escalar, self.y * escalar, self.z * escalar)

    def modulo(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)

    # (1) determinar si dos vectores son perpendiculares
    def perpendicular1(self, otro):
        return (self + otro).modulo() == (self - otro).modulo()

    def perpendicular2(self, otro):
        return (self - otro).modulo() == (otro - self).modulo()

    def perpendicular3(self, otro):
        return self.producto_escalar(otro) == 0

    def perpendicular4(self, otro):
        return (self + otro).modulo()**2 == self.modulo()**2 + otro.modulo()**2

    # (2) determinar si dos vectores son paralelos
    def paralela1(self, otro):
        return (self.x * otro.y == self.y * otro.x and
                self.x * otro.z == self.z * otro.x and
                self.y * otro.z == self.z * otro.y)

    def paralela2(self, otro):
        cross = self.producto_vectorial(otro)
        return cross.x == 0 and cross.y == 0 and cross.z == 0

    # (3) determinar la proyección de dos vectores,
    def proyeccion_sobre(self, otro):
        escalar = self.producto_escalar(otro) / otro.modulo()**2
        return otro * escalar

    # (4) determinar el componente de dos vectores.
    def componente_en(self, otro):
        return self.producto_escalar(otro) / otro.modulo()

    # 2.
    # a) Suma de dos vectores a y b, YA IMPLEMENTADO ARRIBA
    
    # b) Multiplicaci´on de un escalar r por un vector a
    def __rmul__(self, escalar): 
        return self.__mul__(escalar)

    # c) Longitud de un vector a:
    def longitud(self):
        return self.modulo()

    # d) Normal de un vector a
    def normal(self):
        m = self.modulo()
        return AlgebraVectorial(self.x / m, self.y / m, self.z / m)

    # e) Producto escalar de a y b
    def producto_escalar(self, otro):
        return self.x * otro.x + self.y * otro.y + self.z * otro.z

    # f) Producto vectorial de a y b
    def producto_vectorial(self, otro):
        return AlgebraVectorial(
            self.y * otro.z - self.z * otro.y,
            self.z * otro.x - self.x * otro.z,
            self.x * otro.y - self.y * otro.x
        )
    
from algebra_vectorial import AlgebraVectorial  

a = AlgebraVectorial(2, 3, 1)
b = AlgebraVectorial(4, 6, 2)
c = AlgebraVectorial(0, 0, 1)

print("Vectores:")
print(f"a = ({a.x}, {a.y}, {a.z})")
print(f"b = ({b.x}, {b.y}, {b.z})")
print(f"c = ({c.x}, {c.y}, {c.z})")
print("\n--- Pruebas ---\n")

print("Perpendicularidades:")
print("a perpendicular1 c?", a.perpendicular1(c))
print("a perpendicular2 c?", a.perpendicular2(c))
print("a perpendicular3 c?", a.perpendicular3(c))
print("a perpendicular4 c?", a.perpendicular4(c))

print("\nParalelismos:")
print("a paralela1 b?", a.paralela1(b))
print("a paralela2 b?", a.paralela2(b))

print("\nProyecciones y componentes:")
proj = a.proyeccion_sobre(b)
comp = a.componente_en(b)
print(f"Proyección de a sobre b: ({proj.x:.2f}, {proj.y:.2f}, {proj.z:.2f})")
print(f"Componente de a en b: {comp:.2f}")

print("\nSuma y resta:")
suma = a + b
resta = a - b
print(f"a + b = ({suma.x}, {suma.y}, {suma.z})")
print(f"a - b = ({resta.x}, {resta.y}, {resta.z})")

print("\nMultiplicación por escalar:")
escalar = 3
mult = a * escalar
print(f"a * {escalar} = ({mult.x}, {mult.y}, {mult.z})")

print("\nLongitud y vector normal:")
print(f"|a| = {a.modulo():.2f}")
norm = a.normal()
print(f"Normalizado a: ({norm.x:.2f}, {norm.y:.2f}, {norm.z:.2f})")

print("\nProducto escalar y vectorial:")
print(f"a · b = {a.producto_escalar(b)}")
prod_vec = a.producto_vectorial(b)
print(f"a × b = ({prod_vec.x}, {prod_vec.y}, {prod_vec.z})")
