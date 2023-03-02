---
title: FileDriver.CreateLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: FileDriver método. Crea la capa y la abre para agregarla.
type: docs
weight: 60
url: /es/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Crea la capa y la abre para agregarla.

```csharp
public VectorLayer CreateLayer(string path)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception/) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede crear capas vectoriales (ver[`CanCreateLayers`](../cancreatelayers/)). |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Crea la capa y la abre para agregarla.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception/) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede crear capas vectoriales (ver[`CanCreateLayers`](../cancreatelayers/)). |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Crea la capa y la abre para agregarla.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | DriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception/) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede crear capas vectoriales (ver[`CanCreateLayers`](../cancreatelayers/)). |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Crea la capa y la abre para agregarla.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| options | DriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception/) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede crear capas vectoriales (ver[`CanCreateLayers`](../cancreatelayers/)). |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Crea la capa y la abre para agregarla.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception/) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El sistema de referencia espacial no es compatible con el controlador. Usar[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) para verificar si el sistema de referencia espacial es compatible. |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Crea la capa y la abre para agregarla.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception/) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El sistema de referencia espacial no es compatible con el controlador. Usar[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) para verificar si el sistema de referencia espacial es compatible. |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Crea la capa y la abre para agregarla.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | DriverOptions | Opciones específicas del conductor. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception/) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El sistema de referencia espacial no es compatible con el controlador. Usar[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) para verificar si el sistema de referencia espacial es compatible. |
| NotSupportedException | El controlador no puede crear capas vectoriales (ver[`CanCreateLayers`](../cancreatelayers/)). |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Crea la capa y la abre para agregarla.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| options | DriverOptions | Opciones específicas del conductor. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception/) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El sistema de referencia espacial no es compatible con el controlador. Usar[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) para verificar si el sistema de referencia espacial es compatible. |
| NotSupportedException | El controlador no puede crear capas vectoriales (ver[`CanCreateLayers`](../cancreatelayers/)). |

### Ver también

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)


