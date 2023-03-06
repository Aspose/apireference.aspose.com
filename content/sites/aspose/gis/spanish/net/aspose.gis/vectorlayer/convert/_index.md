---
title: VectorLayer.Convert
second_title: Referencia de API de Aspose.GIS para .NET
description: VectorLayer método. Convierte una capa a un formato diferente.
type: docs
weight: 200
url: /es/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Convierte una capa a un formato diferente.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| sourcePath | String | Ruta a la capa que se convertirá. |
| sourceDriver | FileDriver | El controlador de formato para la capa de origen. |
| destinationPath | String | Ruta a la capa que se creará como resultado de la conversión. |
| destinationDriver | FileDriver | El controlador de formato para la capa de destino. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | Cualquiera de los caminos es`null`. |

### Ver también

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* espacio de nombres [Aspose.Gis](../../vectorlayer/)
* asamblea [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Convierte una capa a un formato diferente.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| sourcePath | AbstractPath | Ruta a la capa que se convertirá. |
| sourceDriver | FileDriver | El controlador de formato para la capa de origen. |
| destinationPath | AbstractPath | Ruta a la capa que se creará como resultado de la conversión. |
| destinationDriver | FileDriver | El controlador de formato para la capa de destino. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | Cualquiera de los caminos es`null`. |

### Ver también

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* espacio de nombres [Aspose.Gis](../../vectorlayer/)
* asamblea [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Convierte una capa a un formato diferente.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| sourcePath | String | Ruta a la capa que se convertirá. |
| sourceDriver | FileDriver | El controlador de formato para la capa de origen. |
| destinationPath | String | Ruta a la capa que se creará como resultado de la conversión. |
| destinationDriver | FileDriver | El controlador de formato para la capa de destino. |
| options | ConversionOptions | Opciones para el procedimiento de conversión. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | Cualquiera de los caminos es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception/) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | Sistema de referencia espacial especificado en*options* no es compatible con*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La transformación de la geometría de entidades del sistema de referencia espacial de origen al sistema de referencia espacial de destino falló. |

### Ver también

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* espacio de nombres [Aspose.Gis](../../vectorlayer/)
* asamblea [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Convierte una capa a un formato diferente.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| sourcePath | AbstractPath | Ruta a la capa que se convertirá. |
| sourceDriver | FileDriver | El controlador de formato para la capa de origen. |
| destinationPath | AbstractPath | Ruta a la capa que se creará como resultado de la conversión. |
| destinationDriver | FileDriver | El controlador de formato para la capa de destino. |
| options | ConversionOptions | Opciones para el procedimiento de conversión. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | Cualquiera de los caminos es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception/) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | Sistema de referencia espacial especificado en*options* no es compatible con*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La transformación de la geometría de entidades del sistema de referencia espacial de origen al sistema de referencia espacial de destino falló. |

### Ver también

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* espacio de nombres [Aspose.Gis](../../vectorlayer/)
* asamblea [Aspose.GIS](../../../)


