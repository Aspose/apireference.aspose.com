---
title: Feature.GetValues
second_title: Referencia de API de Aspose.GIS para .NET
description: Feature método. Devuelve los valores de todos los atributos de una matriz.
type: docs
weight: 50
url: /es/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

Devuelve los valores de todos los atributos de una matriz.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| values | Object[] | La matriz en la que copiar los valores de los atributos. |
| defaultValue | Object | El valor que se devolverá si falta el valor del atributo (sin establecer). El valor predeterminado es`null`. Considere usar 'DBNull.Value' para separar 'unset' y '`null` valores. |

### Valor_devuelto

Una serie de atributos copiados.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el argumento es`null`. |
| InvalidOperationException | El atributo no está bloqueado. |

### Observaciones

Los atributos de valores de la característica se copian en la matriz de valores que se pasa como parámetro. Para los atributos con un valor no establecido, se devuelve el parámetro 'unsetValue' especificado.  No es necesario que la longitud de la matriz de valores coincida con la cantidad de atributos de la entidad. Si la longitud de la matriz es mayor que la cantidad de atributos, todos los valores de los atributos se copian en la matriz; si es menor, solo el número de longitud de la matriz de valores de atributo se copia en la matriz, comenzando en el valor de atributo con ordinal 0.

### Ver también

* class [Feature](../)
* espacio de nombres [Aspose.Gis](../../feature/)
* asamblea [Aspose.GIS](../../../)


