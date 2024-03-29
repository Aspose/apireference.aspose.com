---
title: CommentCollection classe
second_title: Aspose.Cells for Python via .NET API Referenze
description:
type: docs
weight: 300
url: /it/aspose.cells/commentcollection/
is_root: false
---
##  CommentCollection classe
Incapsula una raccolta di [`Comment`](/cells/python-net/it/aspose.cells/comment) oggetti.



Il tipo CommentCollection espone i seguenti membri:

###  Proprietà
| Proprietà| Descrizione|
| :- | :- |
| [capacity](/cells/python-net/it/aspose.cells/commentcollection/capacity) | Ottiene o imposta il numero di elementi che l'elenco di matrici può contenere.|


###  Metodi
| Metodo| Descrizione|
| :- | :- |
| [add_threaded_comment](/cells/python-net/it/aspose.cells/commentcollection/add_threaded_comment/#int-int-str-aspose.cells.ThreadedCommentAuthor) | Aggiunge un commento in thread.|
| [add_threaded_comment](/cells/python-net/it/aspose.cells/commentcollection/add_threaded_comment/#str-str-aspose.cells.ThreadedCommentAuthor) | Aggiunge un commento in thread.|
| [get_threaded_comments](/cells/python-net/it/aspose.cells/commentcollection/get_threaded_comments/#int-int) | Ottiene i commenti in thread per indice di riga e colonna.|
| [get_threaded_comments](/cells/python-net/it/aspose.cells/commentcollection/get_threaded_comments/#str) |Ottiene i commenti in thread in base al nome della cella.|
| [add](/cells/python-net/it/aspose.cells/commentcollection/add/#int-int) | Aggiunge un commento alla raccolta.|
| [add](/cells/python-net/it/aspose.cells/commentcollection/add/#str) | Aggiunge un commento alla raccolta.|
| [remove_at](/cells/python-net/it/aspose.cells/commentcollection/remove_at/#str) | Rimuove il commento della cella specifica.|
| [remove_at](/cells/python-net/it/aspose.cells/commentcollection/remove_at/#int-int) | Rimuove il commento della cella specifica.|
| [copy_to](/cells/python-net/it/aspose.cells/commentcollection/copy_to/#list) | Copia l'intero elenco di matrici in un elenco di matrici unidimensionali compatibile, a partire dall'inizio dell'elenco di matrici di destinazione.|
| [copy_to](/cells/python-net/it/aspose.cells/commentcollection/copy_to/#int-list-int-int) | Copia un intervallo di elementi dall'elenco di matrici a un elenco di matrici unidimensionali compatibile, a partire dall'indice specificato dell'elenco di matrici di destinazione.|
| [index_of](/cells/python-net/it/aspose.cells/commentcollection/index_of/#aspose.cells.Comment-int) | Cerca l'oggetto specificato e restituisce l'indice in base zero della prima occorrenza all'interno dell'intervallo di elementi nell'elenco di matrice che si estende dall'indice specificato all'ultimo elemento.|
| [index_of](/cells/python-net/it/aspose.cells/commentcollection/index_of/#aspose.cells.Comment-int-int) |Cerca l'oggetto specificato e restituisce l'indice in base zero della prima occorrenza all'interno dell'intervallo di elementi nell'elenco di matrice che inizia in corrispondenza dell'indice specificato e contiene il numero di elementi specificato.|
| [last_index_of](/cells/python-net/it/aspose.cells/commentcollection/last_index_of/#aspose.cells.Comment) | Cerca l'oggetto specificato e restituisce l'indice in base zero dell'ultima occorrenza all'interno dell'intero elenco di matrici.|
| [last_index_of](/cells/python-net/it/aspose.cells/commentcollection/last_index_of/#aspose.cells.Comment-int) | Cerca l'oggetto specificato e restituisce l'indice in base zero dell'ultima occorrenza all'interno dell'intervallo di elementi nell'elenco di matrice che si estende dal primo elemento all'indice specificato.|
| [last_index_of](/cells/python-net/it/aspose.cells/commentcollection/last_index_of/#aspose.cells.Comment-int-int) | Cerca l'oggetto specificato e restituisce l'indice in base zero dell'ultima occorrenza all'interno dell'intervallo di elementi nell'elenco di matrice che contiene il numero di elementi specificato e termina con l'indice specificato.|
| [binary_search](/cells/python-net/it/aspose.cells/commentcollection/binary_search/#aspose.cells.Comment) | Cerca un elemento nell'intero elenco di array ordinato utilizzando l'operatore di confronto predefinito e restituisce l'indice in base zero dell'elemento.|



###  Esempio

```python
from aspose.cells import Workbook

workbook = Workbook()
comments = workbook.worksheets[0].comments

```

###  Guarda anche
* modulo [`aspose.cells`](..)
* classe [`Comment`](/cells/python-net/it/aspose.cells/comment)
