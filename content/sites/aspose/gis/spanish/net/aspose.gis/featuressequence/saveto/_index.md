---
title: FeaturesSequence.SaveTo
second_title: Referencia de API de Aspose.GIS para .NET
description: FeaturesSequence método. Guarda la secuencia de características en la capa.
type: docs
weight: 50
url: /es/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

Guarda la secuencia de características en la capa.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| destinationPath | String | Ruta a la capa de salida. |
| destinationDriver | FileDriver | El controlador de formato para la capa de salida. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | Cualquier argumento es`null`. |
| [GisException](../../gisexception/) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La transformación de la geometría de entidades del sistema de referencia espacial de origen al sistema de referencia espacial de destino falló. |

### Ver también

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* espacio de nombres [Aspose.Gis](../../featuressequence/)
* asamblea [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

Guarda la secuencia de características en la capa.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| destinationPath | AbstractPath | Ruta a la capa de salida. |
| destinationDriver | FileDriver | El controlador de formato para la capa de salida. |

### Excepciones

| excepción | condición |
| --- | --- |
| [GisException](../../gisexception/) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La transformación de la geometría de entidades del sistema de referencia espacial de origen al sistema de referencia espacial de destino falló. |

### Ver también

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* espacio de nombres [Aspose.Gis](../../featuressequence/)
* asamblea [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

Guarda la secuencia de características en la capa.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| destinationPath | String | Ruta a la capa de salida. |
| destinationDriver | FileDriver | El controlador de formato para la capa de salida. |
| options | SavingOptions | Opciones para el procedimiento de guardado. |

### Excepciones

| excepción | condición |
| --- | --- |
| [GisException](../../gisexception/) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La transformación de la geometría de entidades del sistema de referencia espacial de origen al sistema de referencia espacial de destino falló. |
| NotSupportedException | Sistema de referencia espacial especificado en*options* no es compatible con*destinationDriver* . |

### Ver también

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* espacio de nombres [Aspose.Gis](../../featuressequence/)
* asamblea [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

Guarda la secuencia de características en la capa.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| destinationPath | AbstractPath | Ruta a la capa de salida. |
| destinationDriver | FileDriver | El controlador de formato para la capa de salida. |
| options | SavingOptions | Opciones para el procedimiento de guardado. |

### Excepciones

| excepción | condición |
| --- | --- |
| [GisException](../../gisexception/) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La transformación de la geometría de entidades del sistema de referencia espacial de origen al sistema de referencia espacial de destino falló. |
| NotSupportedException | Sistema de referencia espacial especificado en*options* no es compatible con*destinationDriver* . |

### Ver también

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* espacio de nombres [Aspose.Gis](../../featuressequence/)
* asamblea [Aspose.GIS](../../../)


