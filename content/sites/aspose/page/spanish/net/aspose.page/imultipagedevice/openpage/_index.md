---
title: IMultiPageDevice.OpenPage
second_title: Referencia de la API de Aspose.Page para .NET
description: IMultiPageDevice método. Hace la preparación necesaria del dispositivo antes de renderizar la página.
type: docs
weight: 40
url: /es/net/aspose.page/imultipagedevice/openpage/
---
## OpenPage(string) {#openpage_1}

Hace la preparación necesaria del dispositivo antes de renderizar la página.

```csharp
public bool OpenPage(string title)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| title | String | El título de la página. |

### Valor_devuelto

Verdadero si la página es del rango solicitado; de lo contrario, falso. Se usa en dispositivos que pueden generar una matriz específica de números de página.

### Ver también

* interface [IMultiPageDevice](../)
* espacio de nombres [Aspose.Page](../../imultipagedevice/)
* asamblea [Aspose.Page](../../../)

---

## OpenPage(float, float) {#openpage}

Realiza la preparación necesaria del dispositivo antes de cada renderizado de página.

```csharp
public bool OpenPage(float width, float height)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| width | Single | Un ancho de página. |
| height | Single | Una altura de la página. |

### Valor_devuelto

Devuelve verdadero si la página abierta tiene un número que se encuentra en un rango de números de página seleccionados y falso en caso contrario.

### Ver también

* interface [IMultiPageDevice](../)
* espacio de nombres [Aspose.Page](../../imultipagedevice/)
* asamblea [Aspose.Page](../../../)


