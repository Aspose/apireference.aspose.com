---
title: "IPathSegment"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta l'interfaccia di qualsiasi segmento di percorso."
type: docs
weight: 131
url: /it/java/com.aspose.font/ipathsegment/
---
**All Implemented Interfaces:**
java.lang.Cloneable
```
public interface IPathSegment extends Cloneable
```

Rappresenta l'interfaccia di qualsiasi segmento di percorso.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [copy()](#copy--) | Crea una copia dell'oggetto segmento. |
| [shift(double dx, double dy)](#shift-double-double-) | Esegue lo spostamento per le coordinate x e y. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Trasforma le coordinate con la matrice di trasformazione. |
### copy() {#copy--}
```
public abstract IPathSegment copy()
```


Crea una copia dell'oggetto segmento.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public abstract void shift(double dx, double dy)
```


Esegue lo spostamento per le coordinate x e y.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dx | double | Valore dx. |
| dy | double | Valore dy. |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public abstract void transform(TransformationMatrix matrix)
```


Trasforma le coordinate con la matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrice di trasformazione. |

