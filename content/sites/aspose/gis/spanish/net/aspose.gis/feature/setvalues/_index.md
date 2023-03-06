---
title: Feature.SetValues
second_title: Referencia de API de Aspose.GIS para .NET
description: Feature método. Establece nuevos valores para todos los atributos. También considere usarCopyValues método para agilizar la configuración de valores en una llamada.
type: docs
weight: 120
url: /es/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

Establece nuevos valores para todos los atributos. También considere usar[`CopyValues`](../copyvalues/) método para agilizar la configuración de valores en una llamada.

```csharp
public int SetValues(object[] values)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| values | Object[] | La matriz de nuevos valores. |

### Valor_devuelto

El número de valores de atributo establecidos.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento no puede ser`null`. |
| ArgumentException | El atributo con este nombre no existe en esta capa. |
| InvalidOperationException | El atributo no está bloqueado. |
| InvalidCastException | El tipo del valor no implementaIConvertible. |
| FormatException | La conversión falló porque el valor tiene un formato incorrecto. |
| OverflowException | La conversión falló debido a un desbordamiento. |

### Observaciones

Este método convierte cada valor automáticamente al tipo del atributo.  No es necesario que la longitud de la matriz de valores coincida con la cantidad de atributos de la entidad. Si la longitud de la matriz es mayor que la cantidad de atributos, todos los valores de la matriz se copian en los atributos; si es menor, solo el número de valores de la longitud de la matriz se copia en los atributos, comenzando en el valor del atributo con el ordinal 0.

### Ver también

* class [Feature](../)
* espacio de nombres [Aspose.Gis](../../feature/)
* asamblea [Aspose.GIS](../../../)


