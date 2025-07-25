---
title: ConditionalFormattingIconCollection klass
second_title: Aspose.Cells for Python via .NET API Referenser
description:
type: docs
weight: 300
url: /sv/aspose.cells/conditionalformattingiconcollection/
is_root: false
---
##  ConditionalFormattingIconCollection klass
Representerar en samling av [`ConditionalFormattingIcon`](/cells/python-net/sv/aspose.cells/conditionalformattingicon) objekt.



Typen ConditionalFormattingIconCollection avslöjar följande medlemmar:

###  Egenskaper
| Fast egendom| Beskrivning|
| :- | :- |
| [capacity](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/capacity) | Hämtar eller anger antalet element som arraylistan kan innehålla.|


###  Metoder
| Metod| Beskrivning|
| :- | :- |
| [`add(self, type, index)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/add/#aspose.cells.iconsettype-int) | Lägger till objektet [`ConditionalFormattingIcon`](/cells/python-net/sv/aspose.cells/conditionalformattingicon).|
| [`add(self, cficon)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/add/#aspose.cells.conditionalformattingicon) | Lägger till objektet [`ConditionalFormattingIcon`](/cells/python-net/sv/aspose.cells/conditionalformattingicon).|
| [`copy_to(self, array)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/copy_to/#list) |Kopierar hela arraylistan till en kompatibel endimensionell arraylista, med början i början av målarraylistan.|
| [`copy_to(self, index, array, array_index, count)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/copy_to/#int-list-int-int) | Kopierar ett elementområde från arraylistan till en kompatibel endimensionell arraylista, med början vid det angivna indexet för målarraylistan.|
| [`index_of(self, item, index)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/index_of/#aspose.cells.conditionalformattingicon-int) | Söker efter det angivna objektet och returnerar det nollbaserade indexet för den första förekomsten inom intervallet av element i arraylistan som sträcker sig från det angivna indexet till det sista elementet.|
| [`index_of(self, item, index, count)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/index_of/#aspose.cells.conditionalformattingicon-int-int) | Söker efter det angivna objektet och returnerar det nollbaserade indexet för den första förekomsten inom elementintervallet i arraylistan som börjar vid det angivna indexet och innehåller det angivna antalet element.|
| [`last_index_of(self, item)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/last_index_of/#aspose.cells.conditionalformattingicon) | Söker efter det angivna objektet och returnerar det nollbaserade indexet för den senaste förekomsten inom hela arraylistan.|
| [`last_index_of(self, item, index)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/last_index_of/#aspose.cells.conditionalformattingicon-int) |Söker efter det angivna objektet och returnerar det nollbaserade indexet för den senaste förekomsten inom intervallet av element i arraylistan som sträcker sig från det första elementet till det angivna indexet.|
| [`last_index_of(self, item, index, count)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/last_index_of/#aspose.cells.conditionalformattingicon-int-int) | Söker efter det angivna objektet och returnerar det nollbaserade indexet för den senaste förekomsten inom elementintervallet i arraylistan som innehåller det angivna antalet element och slutar vid det angivna indexet.|
| [`binary_search(self, item)`](/cells/python-net/sv/aspose.cells/conditionalformattingiconcollection/binary_search/#aspose.cells.conditionalformattingicon) | Söker igenom hela den sorterade arraylistan efter ett element med hjälp av standardjämföraren och returnerar elementets nollbaserade index.|



###  Exempel

```python
from aspose.cells import CellArea, FormatConditionType, IconSetType, Workbook

# Instantiating a Workbook object
workbook = Workbook()
sheet = workbook.worksheets[0]
# Get Conditional Formatting
cformattings = sheet.conditional_formattings
# Adds an empty conditional formatting
index = cformattings.add()
# Get newly added Conditional formatting
fcs = cformattings[index]
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
# Sets condition
idx = fcs.add_condition(FormatConditionType.ICON_SET)
cond = fcs[idx]
# Sets condition's type
cond.icon_set.type = IconSetType.ARROWS_GRAY3
# Add custom iconset condition.
cfIcon = cond.icon_set.cf_icons[0]
cfIcon.type = IconSetType.ARROWS3
cfIcon.index = 0
cfIcon1 = cond.icon_set.cf_icons[1]
cfIcon1.type = IconSetType.ARROWS_GRAY3
cfIcon1.index = 1
cfIcon2 = cond.icon_set.cf_icons[2]
cfIcon2.type = IconSetType.BOXES5
cfIcon2.index = 2
# Saving the Excel file
workbook.save("output.xls")

```

###  Se även
* modul [`aspose.cells`](..)
* klass [`ConditionalFormattingIcon`](/cells/python-net/sv/aspose.cells/conditionalformattingicon)
