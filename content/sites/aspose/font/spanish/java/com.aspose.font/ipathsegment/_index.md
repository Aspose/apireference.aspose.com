---
title: "IPathSegment"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la interfaz de cualquier segmento de ruta."
type: docs
weight: 131
url: /es/java/com.aspose.font/ipathsegment/
---
**All Implemented Interfaces:**
java.lang.Cloneable
```
public interface IPathSegment extends Cloneable
```

Representa la interfaz de cualquier segmento de ruta.
## Métodos

| Método | Descripción |
| --- | --- |
| [copy()](#copy--) | Crea una copia del objeto segmento. |
| [shift(double dx, double dy)](#shift-double-double-) | Realiza un desplazamiento por las coordenadas x e y. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transforma las coordenadas con la matriz de transformación. |
### copy() {#copy--}
```
public abstract IPathSegment copy()
```


Crea una copia del objeto segmento.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public abstract void shift(double dx, double dy)
```


Realiza un desplazamiento por las coordenadas x e y.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| dx | double | Valor dx. |
| dy | double | Valor dy. |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public abstract void transform(TransformationMatrix matrix)
```


Transforma las coordenadas con la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matriz de transformación. |

