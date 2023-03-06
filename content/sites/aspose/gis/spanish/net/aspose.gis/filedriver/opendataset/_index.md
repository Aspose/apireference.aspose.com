---
title: FileDriver.OpenDataset
second_title: Referencia de API de Aspose.GIS para .NET
description: FileDriver método. Abre el conjunto de datos.
type: docs
weight: 80
url: /es/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

Abre el conjunto de datos.

```csharp
public Dataset OpenDataset(string path)
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
| [GisException](../../gisexception/) | Error al leer el conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |

### Ver también

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

Abre el conjunto de datos.

```csharp
public Dataset OpenDataset(AbstractPath path)
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
| [GisException](../../gisexception/) | Error al leer el conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |

### Ver también

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

Abre el conjunto de datos.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
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
| [GisException](../../gisexception/) | Error al leer el conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |

### Ver también

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Abre el conjunto de datos.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../gisexception/) | Error al leer el conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |

### Ver también

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espacio de nombres [Aspose.Gis](../../filedriver/)
* asamblea [Aspose.GIS](../../../)


