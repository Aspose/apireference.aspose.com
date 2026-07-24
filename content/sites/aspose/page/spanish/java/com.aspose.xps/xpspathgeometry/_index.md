---
title: "XpsPathGeometry"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características del elemento de propiedad PathGeometry."
type: docs
weight: 42
url: /es/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Clase que encapsula características del elemento de propiedad PathGeometry. Este elemento contiene un conjunto de figuras de ruta especificadas ya sea con el atributo Figures o con un elemento hijo PathFigure.
## Métodos

| Método | Descripción |
| --- | --- |
| [add(T obj)](#add-T-) | Agrega un nuevo objeto al arreglo. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Agrega un segmento de ruta a la lista de segmentos secundarios de la última figura pah. |
| [deepClone()](#deepClone--) | Clona esta geometría de ruta. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Proporciona acceso al elemento del arreglo por índice i. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Devuelve el valor que especifica cómo se combinan las áreas intersectadas de formas geométricas para formar una región. |
| [getPathFigures()](#getPathFigures--) | Devuelve la lista de figuras de ruta secundarias. |
| [getTransform()](#getTransform--) | Devuelve la matriz de transformación afín que establece la transformación matricial local que se aplica a todos los elementos secundarios y descendientes de la geometría de ruta antes de que se use para rellenar, recortar o trazar. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Inserta un nuevo objeto en el arreglo en la posición especificada. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Inserta un segmento de ruta en la lista de segmentos secundarios de la última figura de ruta en la posición de índice. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Elimina un objeto del arreglo. |
| [removeAt(int index)](#removeAt-int-) | Elimina un objeto del arreglo en la posición especificada. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Elimina un segmento de ruta de la lista de segmentos secundarios de la última figura de ruta. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Elimina un segmento de ruta de la lista de segmentos secundarios de la última figura de ruta en la posición de índice. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Establece el valor que especifica cómo se combinan las áreas intersectadas de formas geométricas para formar una región. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Establece la matriz de transformación afín que define la transformación matricial local que se aplica a todos los elementos secundarios y descendientes de la geometría de ruta antes de que se use para rellenar, recortar o trazar. |
| [size()](#size--) | Devuelve el número de elementos. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Agrega un nuevo objeto al arreglo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | T | El objeto a agregar. |

**Returns:**
T - Objeto agregado.
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Agrega un segmento de ruta a la lista de segmentos secundarios de la última figura pah.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | El segmento de ruta a agregar. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Clona esta geometría de ruta.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int i) {#get-int-}
```
public T get(int i)
```


Proporciona acceso al elemento del arreglo por índice i.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| i | int | Índice del elemento. |

**Returns:**
T - El elemento en la posición i.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Devuelve el valor que especifica cómo se combinan las áreas intersectadas de formas geométricas para formar una región.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Devuelve la lista de figuras de ruta secundarias.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - La lista de figuras de ruta secundarias.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Devuelve la matriz de transformación afín que establece la transformación matricial local que se aplica a todos los elementos secundarios y descendientes de la geometría de ruta antes de que se use para rellenar, recortar o trazar.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Inserta un nuevo objeto en el arreglo en la posición especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | La posición donde insertar un objeto. |
| obj | T | El objeto a insertar. |

**Returns:**
T - Objeto insertado.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Inserta un segmento de ruta en la lista de segmentos secundarios de la última figura de ruta en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un segmento. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Un segmento de ruta a insertar. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Elimina un objeto del arreglo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | T | El objeto a eliminar. |

**Returns:**
T - Objeto eliminado.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Elimina un objeto del arreglo en la posición especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | La posición donde eliminar un objeto. |

**Returns:**
T - Objeto eliminado.
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Elimina un segmento de ruta de la lista de segmentos secundarios de la última figura de ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | El segmento de ruta a eliminar. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Elimina un segmento de ruta de la lista de segmentos secundarios de la última figura de ruta en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe eliminar un segmento de ruta. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Establece el valor que especifica cómo se combinan las áreas intersectadas de formas geométricas para formar una región.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | El valor que especifica cómo se combinan las áreas intersectadas de formas geométricas para formar una región. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Establece la matriz de transformación afín que define la transformación matricial local que se aplica a todos los elementos secundarios y descendientes de la geometría de ruta antes de que se use para rellenar, recortar o trazar.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matriz de transformación afín. |

### size() {#size--}
```
public int size()
```


Devuelve el número de elementos.

**Returns:**
int - El número de elementos.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

