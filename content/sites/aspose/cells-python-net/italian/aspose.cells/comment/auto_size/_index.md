---
title: auto_size proprietà
second_title: Aspose.Cells for Python via .NET API Riferimenti
description:
type: docs
weight: 80
url: /it/aspose.cells/comment/auto_size/
is_root: false
---
##  auto_size proprietà

Indica se la dimensione del commento viene regolata automaticamente in base al suo contenuto.
Nota: in alcuni casi particolari (ad esempio in ambiente Mac), questa impostazione potrebbe non avere effetto. Se questa impostazione non ha effetto, sostituirla con FitToTextSize().

###  Esempio

```python

if notcomment1.auto_size:
    # The size of the comment varies with the content
    comment1.auto_size = True

```
###  Definizione:
```python
@property
def auto_size(self):
    ...
@auto_size.setter
def auto_size(self, value):
    ...
```

###  Guarda anche
* modulo [`aspose.cells`](../../)
* classe [`Comment`](/cells/python-net/it/aspose.cells/comment)
