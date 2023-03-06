---
title: Feature.CopyValues
second_title: Referencia de API de Aspose.GIS para .NET
description: Feature método. Copia valores de atributos de otra característica.
type: docs
weight: 20
url: /es/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

Copia valores de atributos de otra característica.

```csharp
public void CopyValues(Feature inputFeature)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| inputFeature | Feature | La función desde la que copiar valores. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el argumento es`null`. |
| ArgumentException | El atributo con este nombre no existe en esta capa. |
| InvalidOperationException | El atributo no está bloqueado. |
| InvalidOperationException | El valor de entrada es nulo y el atributo en esta función no puede ser nulo. |
| [GisException](../../gisexception/) | Un atributo tiene el mismo nombre pero diferentes tipos de datos en las características. |

### Observaciones

Este método solo copia atributos con nombres coincidentes.

### Ver también

* class [Feature](../)
* espacio de nombres [Aspose.Gis](../../feature/)
* asamblea [Aspose.GIS](../../../)


