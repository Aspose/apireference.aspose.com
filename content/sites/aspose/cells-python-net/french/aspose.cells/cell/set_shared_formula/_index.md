---
title: méthode set_shared_formula
second_title: Aspose.Cells for Python via .NET API Références
description:
type: docs
weight: 360
url: /fr/aspose.cells/cell/set_shared_formula/
is_root: false
---
##  set_shared_formula(self, shared_formula, row_number, column_number) {#str-int-int}
Définit des formules partagées sur une plage de cellules.



```python

def set_shared_formula(self, shared_formula, row_number, column_number):
    ...
```


| Paramètre| Taper| Description|
| :- | :- | :- |
| shared_formula | str | Formule partagée.|
| row_number | int | Nombre de lignes pour remplir la formule.|
| column_number | int | Nombre de colonnes pour remplir la formule.|
###  Remarques



##  set_shared_formula(self, shared_formula, row_number, column_number, options) {#str-int-int-aspose.cells.FormulaParseOptions}

Définit des formules partagées sur une plage de cellules.



```python

def set_shared_formula(self, shared_formula, row_number, column_number, options):
    ...
```


| Paramètre| Taper| Description|
| :- | :- | :- |
| shared_formula | str | Formule partagée.|
| row_number | int | Nombre de lignes pour remplir la formule.|
| column_number | int | Nombre de colonnes pour remplir la formule.|
| options | [`FormulaParseOptions`](/cells/python-net/fr/aspose.cells/formulaparseoptions) | Options d'analyse de la formule.|


##  set_shared_formula(self, shared_formula, row_number, column_number, is_r1c1, is_local) {#str-int-int-bool-bool}
Définit une formule sur une plage de cellules.



```python

def set_shared_formula(self, shared_formula, row_number, column_number, is_r1c1, is_local):
    ...
```


| Paramètre| Taper| Description|
| :- | :- | :- |
| shared_formula | str | Formule partagée.|
| row_number | int | Nombre de lignes pour remplir la formule.|
| column_number | int | Nombre de colonnes pour remplir la formule.|
| is_r1c1 | bool | si la formule est la formule R1C1|
| is_local | bool | si la formule est formatée en fonction des paramètres régionaux|
###  Remarques

REMARQUE : Cette classe est désormais obsolète. À la place,
veuillez utiliser Cell.SetSharedFormula(string,int,int,FormulaParseOptions).
Cette propriété sera supprimée 12 mois plus tard soit en décembre 2019.
Aspose s'excuse pour tout inconvénient que vous avez pu rencontrer.

##  set_shared_formula(self, shared_formula, row_number, column_number, options, values) {#str-int-int-aspose.cells.FormulaParseOptions-list}
Définit des formules partagées sur une plage de cellules.



```python

def set_shared_formula(self, shared_formula, row_number, column_number, options, values):
    ...
```


| Paramètre| Taper| Description|
| :- | :- | :- |
| shared_formula | str | Formule partagée.|
| row_number | int | Nombre de lignes pour remplir la formule.|
| column_number | int | Nombre de colonnes pour remplir la formule.|
| options | [`FormulaParseOptions`](/cells/python-net/fr/aspose.cells/formulaparseoptions) | Options d'analyse de la formule.|
| values | list | valeurs pour les cellules avec une formule partagée donnée|



###  Voir également
* module [`aspose.cells`](../../)
* classe [`Cell`](/cells/python-net/fr/aspose.cells/cell)
