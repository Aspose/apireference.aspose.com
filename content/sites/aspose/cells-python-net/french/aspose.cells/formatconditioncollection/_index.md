---
title: FormatConditionCollection classe
second_title: Aspose.Cells for Python via .NET API Références
description:
type: docs
weight: 710
url: /fr/aspose.cells/formatconditioncollection/
is_root: false
---
##  FormatConditionCollection classe
Représente la mise en forme conditionnelle.
Les FormatConditions peuvent contenir jusqu'à trois formats conditionnels.



Le type FormatConditionCollection expose les membres suivants :

###  Propriétés
| Propriété| Description|
| :- | :- |
| [count](/cells/python-net/fr/aspose.cells/formatconditioncollection/count) | Obtient le nombre de conditions.|
| [range_count](/cells/python-net/fr/aspose.cells/formatconditioncollection/range_count) | Obtient le nombre de plages formatées conditionnellement.|



Obtient la condition de formatage par index.
###  Indexeur
| Nom| Description|
| :- | :- |
| [index] | l'index de la condition de formatage à renvoyer.|


###  Méthodes
| Méthode| Description|
| :- | :- |
| [`add_condition(self, type, operator_type, formula1, formula2)`](/cells/python-net/fr/aspose.cells/formatconditioncollection/add_condition/#aspose.cells.formatconditiontype-aspose.cells.operatortype-str-str) | Ajoute une condition de formatage.|
| [`add_condition(self, type)`](/cells/python-net/fr/aspose.cells/formatconditioncollection/add_condition/#aspose.cells.formatconditiontype) | Ajouter une condition de format.|
| [`remove_area(self, index)`](/cells/python-net/fr/aspose.cells/formatconditioncollection/remove_area/#int) | Supprime la plage de cellules formatées conditionnellement par index.|
| [`remove_area(self, start_row, start_column, total_rows, total_columns)`](/cells/python-net/fr/aspose.cells/formatconditioncollection/remove_area/#int-int-int-int) | Supprimer la mise en forme conditionnelle dans la plage.|
| [`add(self, cell_area, type, operator_type, formula1, formula2)`](/cells/python-net/fr/aspose.cells/formatconditioncollection/add/#aspose.cells.cellarea-aspose.cells.formatconditiontype-aspose.cells.operatortype-str-str) |Ajoute une condition de formatage et une plage de cellules affectée aux FormatConditions<br/>Les FormatConditions peuvent contenir jusqu'à trois formats conditionnels.<br/> Les références aux autres feuilles ne sont pas autorisées dans les formules de mise en forme conditionnelle.|
| [`add_area(self, cell_area)`](/cells/python-net/fr/aspose.cells/formatconditioncollection/add_area/#aspose.cells.cellarea) | Ajoute une plage de cellules formatées conditionnellement.|
| [`get_cell_area(self, index)`](/cells/python-net/fr/aspose.cells/formatconditioncollection/get_cell_area/#int) | Obtient la plage de cellules formatée conditionnellement par index.|
| [`remove_condition(self, index)`](/cells/python-net/fr/aspose.cells/formatconditioncollection/remove_condition/#int) | Supprime la condition de formatage par index.|



###  Exemple

```python
from aspose.cells import CellArea, FormatConditionType, OperatorType, Workbook
from aspose.pydrawing import Color

# Create a new Workbook.
workbook = Workbook()
# Get the first worksheet.
sheet = workbook.worksheets[0]
# Adds an empty conditional formatting
index = sheet.conditional_formattings.add()
fcs = sheet.conditional_formattings[index]
# Sets the conditional format range.
ca = CellArea()
ca.start_row = 0
ca.end_row = 0
ca.start_column = 0
ca.end_column = 0
fcs.add_area(ca)
ca = CellArea()
ca.start_row = 1
ca.end_row = 1
ca.start_column = 1
ca.end_column = 1
fcs.add_area(ca)
# Adds condition.
conditionIndex = fcs.add_condition(FormatConditionType.CELL_VALUE, OperatorType.BETWEEN, "=A2", "100")
# Adds condition.
conditionIndex2 = fcs.add_condition(FormatConditionType.CELL_VALUE, OperatorType.BETWEEN, "50", "100")
# Sets the background color.
fc = fcs[conditionIndex]
fc.style.background_color = Color.red
# Saving the Excel file
workbook.save("output.xls")

```

###  Voir également
* module [`aspose.cells`](..)
