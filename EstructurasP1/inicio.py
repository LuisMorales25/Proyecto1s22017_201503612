from Lista import ListaCircularDoblementeEnlazada
from ListaArchivo import ListaCircularDoblementeEnlazadaArchivo
from ArbolB import ArbolB
from ArbolB2 import ArbolB2
from ArbolAvl import Avl

print ("Lista")
lista=ListaCircularDoblementeEnlazada()
lista.agregar_inicio("luis","fas")
lista.agregar_inicio("fer",754)
lista.agregar_inicio("mo",755)
lista.agregar_inicio("gar",756)
#lista.recorrer_inicio_fin()
lista.recorrer_fin_inicio()
aux = lista.buscarPosNodo("fer",lista.primero)
#print(str(aux.contrasenia))
aux.arbolB.insertar("me")
aux.arbolB.insertar("za")
aux.arbolB.insertar("re")
#aux.keyprivate="jaja"
#aux.keypublic="jejeje"
#print("usuario: "+aux.usuario+" keypublic: "+aux.keypublic+" keyprivate: "+str(aux.keyprivate))
#aux.arbolB.graficar()

listaArchivo=ListaCircularDoblementeEnlazadaArchivo()
listaArchivo.agregar_inicio("joder","luisusac")
listaArchivo.recorrer_fin_inicio()
aux2=listaArchivo.buscarPosNodo("joder",listaArchivo.primero)
if aux2.contrasenia=="luisusac":
	print(aux2.usuario)
else:
	print("nel prro!")

A  = ArbolB2()
A.insertar("aaa")
A.insertar("BB")
A.insertar("ab")
A.insertar("ca")
#A.insertar("za")
#A.insertar("ka")
#A.insertar("ad")
#A.insertar("gf")
#A.insertar("ko")
#A.insertar("lo")
#A.insertar("pe")
#A.insertar("qw")
#A.insertar("cv")
#A.insertar("lv")
#A.insertar("zv")
#A.insertar("rt")
#A.insertar("cnh")
#A.insertar("tg")
#A.insertar("we")
#A.insertar("yy")
#A.insertar("pu")
#A.insertar("ooooooo")
#A.insertar("gfa")
A.graficar()
aux=A.bus(A.raiz,"ab")
print(str(aux.clave))
aux.nuevoArbol.insertar("asd")
aux.nuevoArbol.insertar("zasd")
aux.nuevoArbol.insertar("sfdaferwq")
aux.nuevoArbol.graficar("jejejejejeejeje")
aux.avl.insertar("juan")
#aux.nuevoArbol.avl.insertar_Pro("juan","luis",None)
aber=aux.clave
print(str(aber)+" aaaaaa")
aux.nuevoArbol.bus(aux.nuevoArbol.raiz,"asd").Avl.insertar("juan")
#j.Avl.insertar_Pro("juan","luis",None)
#print(str(j.clave))
b=ArbolB()
b.insertar("juan")
aux2=b.bus(b.raiz,"juan")
aux2.Avl.insertar_Pro("juan","luis",None)

avl = Avl()
#nombre, descripcion, clave
#nodoBinario = ArbolBinario.Nodo("jorge","daniel")
avl.insertar("juan")
avl.insertar("mart")
avl.insertar("abi")
avl.insertar("jesu")
avl.insertar("jesus")
avl.insertar("perr")
avl.insertar("ext")
avl.insertar("mous")
avl.insertar("fer")
avl.insertar("helen")
avl.insertar("fabiola")
avl.insertar("jeje")
avl.insertar("jeje222243")
#avl.eliminar("jesu")
p=avl.busqueda(avl.raiz,"jeje")
if p==None:
	print("nel")
else:
	print(str(p.dato))
#avl.insertar_Pro("jorge","akjsd",nodoBinario)

avl.graficar("luis")