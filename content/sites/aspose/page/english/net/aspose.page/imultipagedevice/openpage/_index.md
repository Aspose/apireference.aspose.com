---
title: IMultiPageDevice.OpenPage
second_title: Aspose.Page for .NET API Reference
description: IMultiPageDevice method. Makes necessary preparation of the device before page rendering
type: docs
weight: 40
url: /net/aspose.page/imultipagedevice/openpage/
---
## OpenPage(string) {#openpage_1}

Makes necessary preparation of the device before page rendering.

```csharp
public bool OpenPage(string title)
```

| Parameter | Type | Description |
| --- | --- | --- |
| title | String | The page title. |

### Return Value

True if page is from requested range, otherwise false. Used in devices that can render specified array of page numbers.

### See Also

* interface [IMultiPageDevice](../)
* namespace [Aspose.Page](../../imultipagedevice/)
* assembly [Aspose.Page](../../../)

---

## OpenPage(float, float) {#openpage}

Makes necessary preparation of the device before each page rendering.

```csharp
public bool OpenPage(float width, float height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Single | A width of the page. |
| height | Single | A height of the page. |

### Return Value

Returns true if opened page has a number that falls in a range of selected page numbers and false otherwise.

### See Also

* interface [IMultiPageDevice](../)
* namespace [Aspose.Page](../../imultipagedevice/)
* assembly [Aspose.Page](../../../)


