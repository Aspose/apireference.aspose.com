---
title: PsDocument.PsDocument
second_title: Aspose.Page for .NET API Reference
description: PsDocument constructor. Initializes empty PsDocument with initialized page
type: docs
weight: 10
url: /net/aspose.page.eps/psdocument/psdocument/
---
## PsDocument(Stream, PsSaveOptions) {#constructor_1}

Initializes empty [`PsDocument`](../) with initialized page.

```csharp
public PsDocument(Stream outPsStream, PsSaveOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| outPsStream | Stream | Stream where to save PS/EPS file. |
| options | PsSaveOptions | A set of parameters controlling saving of PostScript file. |

### See Also

* class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)

---

## PsDocument(Stream, PsSaveOptions, bool) {#constructor_2}

Initializes empty [`PsDocument`](../).

```csharp
public PsDocument(Stream outPsStream, PsSaveOptions options, bool multipaged)
```

| Parameter | Type | Description |
| --- | --- | --- |
| outPsStream | Stream | Stream where to save PS/EPS file. |
| options | PsSaveOptions | A set of parameters controlling saving of PostScript file. |
| multipaged | Boolean | If false page will not be initialized. In this case page initialization should be performed via explicit "openPage(width, height) call. |

### See Also

* class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)

---

## PsDocument(Stream, PsSaveOptions, int) {#constructor_3}

Initializes empty [`PsDocument`](../) when the number of Postscript document pages is known in advance.

```csharp
public PsDocument(Stream outPsStream, PsSaveOptions options, int numberOfPages)
```

| Parameter | Type | Description |
| --- | --- | --- |
| outPsStream | Stream | Stream where to save PS/EPS file. |
| options | PsSaveOptions | A set of parameters controlling saving of PostScript file. |
| numberOfPages | Int32 | The number of pages in the PostScript document. |

### See Also

* class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)

---

## PsDocument(Stream) {#constructor}

Initializes [`PsDocument`](../) with a stream of PS/EPS file.

```csharp
public PsDocument(Stream inPsStream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| inPsStream | Stream | Input stream of PS/EPS file. |

### See Also

* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)


