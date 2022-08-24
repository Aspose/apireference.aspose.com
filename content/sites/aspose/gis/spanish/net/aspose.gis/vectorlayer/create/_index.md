---
title: Create
second_title: Referencia de API de Aspose.GIS para .NET
description: Crea la capa y la abre para agregar nuevas características.
type: docs
weight: 10
url: /es/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Crea la capa y la abre para agregar nuevas características.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| driver | FileDriver | Conductor a utilizar. |

### Valor_devuelto

Una capa de solo escritura.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* espacio de nombres [Aspose.Gis](../../vectorlayer)
* asamblea [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Crea la capa y la abre para agregar nuevas características.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| driver | FileDriver | Conductor a utilizar. |
| options | DriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

Una capa de solo escritura.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* espacio de nombres [Aspose.Gis](../../vectorlayer)
* asamblea [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Crea la capa y la abre para agregar nuevas características.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| driver | FileDriver | Conductor a utilizar. |

### Valor_devuelto

Una capa de solo escritura.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* espacio de nombres [Aspose.Gis](../../vectorlayer)
* asamblea [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Crea la capa y la abre para agregar nuevas características.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| driver | FileDriver | Conductor a utilizar. |
| options | DriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

Una capa de solo escritura.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception) | Error al escribir la función en el archivo. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* espacio de nombres [Aspose.Gis](../../vectorlayer)
* asamblea [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Crea la capa y la abre para agregarla.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| driver | FileDriver | Conductor a utilizar. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El sistema de referencia espacial no es compatible con el controlador. Usar[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) para verificar si el sistema de referencia espacial es compatible. |

### Ver también

* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* espacio de nombres [Aspose.Gis](../../vectorlayer)
* asamblea [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Crea la capa y la abre para agregarla.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| driver | FileDriver | Conductor a utilizar. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El sistema de referencia espacial no es compatible con el controlador. Usar[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) para verificar si el sistema de referencia espacial es compatible. |

### Ver también

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* espacio de nombres [Aspose.Gis](../../vectorlayer)
* asamblea [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Crea la capa y la abre para agregarla.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| driver | FileDriver | Conductor a utilizar. |
| options | DriverOptions | Opciones específicas del conductor. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El sistema de referencia espacial no es compatible con el controlador. Usar[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) para verificar si el sistema de referencia espacial es compatible. |

### Ver también

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* espacio de nombres [Aspose.Gis](../../vectorlayer)
* asamblea [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Crea la capa y la abre para agregarla.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| driver | FileDriver | Conductor a utilizar. |
| options | DriverOptions | Opciones específicas del conductor. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../vectorlayer).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| [GisException](../../gisexception) | Error al leer o escribir la función en/desde el archivo. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El sistema de referencia espacial no es compatible con el controlador. Usar[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) para verificar si el sistema de referencia espacial es compatible. |

### Ver también

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* espacio de nombres [Aspose.Gis](../../vectorlayer)
* asamblea [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
