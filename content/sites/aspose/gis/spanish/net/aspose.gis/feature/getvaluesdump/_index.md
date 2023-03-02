---
title: Feature.GetValuesDump
second_title: Referencia de API de Aspose.GIS para .NET
description: Feature método. Devuelve los valores de todos los atributos de una matriz. Considere usarGetValues método para evitar la asignación de memoria adicional.
type: docs
weight: 60
url: /es/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

Devuelve los valores de todos los atributos de una matriz. Considere usar[`GetValues`](../getvalues/) método para evitar la asignación de memoria adicional.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| defaultValue | Object | El valor que se devolverá si falta el valor del atributo (sin establecer). El valor predeterminado es`null`. Considere usar 'DBNull.Value' para separar 'unset' y '`null` valores. |

### Valor_devuelto

Una nueva matriz en la que copiar los valores de los atributos.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el argumento es`null`. |
| InvalidOperationException | El atributo no está bloqueado. |

### Observaciones

Los atributos de valores de la característica se copian en la matriz de valores que se pasa como parámetro. Para los atributos con un valor no establecido, se devuelve el parámetro 'unsetValue' especificado.

### Ver también

* class [Feature](../)
* espacio de nombres [Aspose.Gis](../../feature/)
* asamblea [Aspose.GIS](../../../)


