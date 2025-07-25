---
title: FontSetting classe
second_title: Aspose.Cells for Python via .NET API Riferimenti
description:
type: docs
weight: 690
url: /it/aspose.cells/fontsetting/
is_root: false
---
##  FontSetting classe
Rappresenta un intervallo di caratteri all'interno del testo della cella.



Il tipo FontSetting espone i seguenti membri:

###  Costruttori
| Costruttore| Descrizione|
| :- | :- |
| [`__init__(self, start_index, length, sheets)`](/cells/python-net/it/aspose.cells/fontsetting/__init__/#int-int-aspose.cells.worksheetcollection) |  |


###  Proprietà
| Proprietà| Descrizione|
| :- | :- |
| [type](/cells/python-net/it/aspose.cells/fontsetting/type) |Ottiene il tipo di nodo di testo.|
| [start_index](/cells/python-net/it/aspose.cells/fontsetting/start_index) | Ottiene l'indice iniziale dei caratteri.|
| [length](/cells/python-net/it/aspose.cells/fontsetting/length) | Ottiene la lunghezza dei caratteri.|
| [font](/cells/python-net/it/aspose.cells/fontsetting/font) | Restituisce il font di questo oggetto.|
| [text_options](/cells/python-net/it/aspose.cells/fontsetting/text_options) | Restituisce le opzioni del testo.|


###  Metodi
| Metodo| Descrizione|
| :- | :- |
| [`set_word_art_style(self, style)`](/cells/python-net/it/aspose.cells/fontsetting/set_word_art_style/#aspose.cells.drawing.presetwordartstyle) | Imposta lo stile WordArt preimpostato.|



###  Esempio

```python
from aspose.cells import Workbook
from aspose.pydrawing import Color

# Instantiating a Workbook object
workbook = Workbook()
# Adding a new worksheet to the Excel object
workbook.worksheets.add()
# Obtaining the reference of the newly added worksheet by passing its sheet index
worksheet = workbook.worksheets[0]
# Accessing the "A1" cell from the worksheet
cell = worksheet.cells.get("A1")
# Adding some value to the "A1" cell
cell.put_value("Visit Aspose!")
# getting charactor
charactor = cell.characters(6, 7)
# Setting the font of selected characters to bold
charactor.font.is_bold = True
# Setting the font color of selected characters to blue
charactor.font.color = Color.blue
# Saving the Excel file
workbook.save("book1.xls")

```

###  Guarda anche
* modulo [`aspose.cells`](..)
