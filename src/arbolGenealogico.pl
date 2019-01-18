
hombre(jose).
hombre(victor).
hombre(carlos).
hombre(joaquin).
hombre(carlosgonzalez).

mujer(silvia).
mujer(isis).
mujer(isabel).
mujer(rosario).
mujer(cynthia).

progenitor(carlos,carlosalberto).
progenitor(rosario,carlosalberto).
progenitor(carlos,cynthia).
progenitor(rosario,cynthia).

progenitor(jose,carlos).
progenitor(silvia,carlos).
progenitor(jose,isabel).
progenitor(silvia,isabel).

progenitor(victor,rosario).
progenitor(isis,rosario).
progenitor(victor,joaquin).
progenitor(isis,joaquin).

pareja(carlos,rosario).
pareja(rosario,carlos).
pareja(jose,silvia).
pareja(silvia,jose).
pareja(victor,isis).
pareja(isis,victor).

marido(X,Y) :-pareja(X,Y),hombre(X).
esposa(X,Y):-pareja(X,Y),mujer(X).
padre(X,Y):-progenitor(X,Y),hombre(X).
madre(X,Y):-progenitor(X,Y),mujer(X).
hijo(Y,X):-progenitor(X,Y),hombre(Y).
hija(Y,X):-progenitor(X,Y),mujer(Y).
abuelo(X,Y):-progenitor(M,Y),progenitor(X,M),hombre(X).
abuela(X,Y):-progenitor(M,Y),progenitor(X,M),mujer(X).
hermana(X,Y):-progenitor(Z,X),progenitor(Z,Y),X\==Y,mujer(X).
hermano(X,Y):-progenitor(Z,X),progenitor(Z,Y),X\==Y,hombre(X).
tio(X,Y):-hermano(X,Z),progenitor(Z,Y).
tia(X,Y):-hermana(X,Z),progenitor(Z,Y).
nieto(X,Y):-progenitor(Y,Z),progenitor(Z,X),hombre(X).
nieta(X,Y):-progenitor(Y,Z),progenitor(Z,X),mujer(X).