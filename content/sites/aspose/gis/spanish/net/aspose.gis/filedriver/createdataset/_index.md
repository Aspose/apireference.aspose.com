---
title: FileDriver.CreateDataset
second_title: Referencia de API de Aspose.GIS para .NET
description: FileDriver método. Crea un conjunto de datos.
type: docs
weight: 50
url: /es/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

Crea un conjunto de datos.

```csharp
public Dataset CreateDataset(string path)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al conjunto de datos. |

### Valor_devuelto

una instancia de[`Dataset`](../../dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception/) | Error al crear el conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | El conjunto de datos ya existe. |

### Ver también

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

Crea un conjunto de datos.

```csharp
public Dataset CreateDataset(AbstractPath path)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al conjunto de datos. |

### Valor_devuelto

una instancia de[`Dataset`](../../dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception/) | Error al crear el conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | El conjunto de datos ya existe. |

### Ver también

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

Crea un conjunto de datos.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al conjunto de datos. |
| options | DriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`Dataset`](../../dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception/) | Error al crear el conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | El conjunto de datos ya existe. |

### Ver también

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Crea un conjunto de datos.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al conjunto de datos. |
| options | DriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`Dataset`](../../dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../gisexception/) | Error al crear el conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | El conjunto de datos ya existe. |

### Ver también

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)


