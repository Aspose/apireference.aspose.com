---
title: Metafile
second_title: Aspose.Drawing for .NET API Referansı
description: Yeni bir örneğini başlatırMetafilesystem.drawing.imaging/metafile belirtilen tanıtıcıdan sınıf.
type: docs
weight: 10
url: /tr/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

Yeni bir örneğini başlatır[`Metafile`](../../metafile) belirtilen tanıtıcıdan sınıf.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| henhmetafile | IntPtr | Gelişmiş bir meta dosyası için bir tanıtıcı. |
| deleteEmf | Boolean | true olduğunda, gelişmiş meta dosyası tanıtıcısını silmek için Metafile silindi; aksi halde yanlış. |

### Ayrıca bakınız

* class [Metafile](../../metafile)
* ad alanı [System.Drawing.Imaging](../../metafile)
* toplantı [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

Yeni bir örneğini başlatır[`Metafile`](../../metafile) belirtilen tanıtıcıdan bir aygıt bağlamına ve birEmfTypebiçimini belirten numaralandırmaMetafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| referenceHdc | IntPtr | Bir aygıt bağlamının tanıtıcısı. |
| emfType | EmfType | BirEmfType biçimini belirtenMetafile. |

### Ayrıca bakınız

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* ad alanı [System.Drawing.Imaging](../../metafile)
* toplantı [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

Yeni bir örneğini başlatır[`Metafile`](../../metafile) belirtilen dosya adından sınıf.

```csharp
public Metafile(string filename)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| filename | String | AString bu, yeni dosyanın oluşturulacağı name dosyasını temsil eder.Metafile. |

### Ayrıca bakınız

* class [Metafile](../../metafile)
* ad alanı [System.Drawing.Imaging](../../metafile)
* toplantı [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

Yeni bir örneğini başlatır[`Metafile`](../../metafile) belirtilen dosya adından sınıf.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| filename | String | AString bu, yeni dosyanın oluşturulacağı name dosyasını temsil eder.Metafile. |
| referenceHdc | IntPtr | Bir aygıt bağlamına yönelik bir Windows tanıtıcısı. |

### Ayrıca bakınız

* class [Metafile](../../metafile)
* ad alanı [System.Drawing.Imaging](../../metafile)
* toplantı [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

Yeni bir örneğini başlatır[`Metafile`](../../metafile) belirtilen veri akışından sınıf.

```csharp
public Metafile(Stream stream)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | Stream | buStream yeniyi oluşturmak için Metafile. |

### Ayrıca bakınız

* class [Metafile](../../metafile)
* ad alanı [System.Drawing.Imaging](../../metafile)
* toplantı [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

Yeni bir örneğini başlatır[`Metafile`](../../metafile) Belirtilen veri akışından bir sınıf ve bir Windows tanıtıcısından bir aygıt bağlamına. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | Stream | AStream bunun için verilerini içerenMetafile. |
| referenceHdc | IntPtr | Bir aygıt bağlamına yönelik bir Windows tanıtıcısıMetafile nesne. |

### Ayrıca bakınız

* class [Metafile](../../metafile)
* ad alanı [System.Drawing.Imaging](../../metafile)
* toplantı [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

Yeni bir örneğini başlatır[`Metafile`](../../metafile) Belirtilen veri akışından bir sınıf, bir aygıt bağlamına bir Windows tanıtıcısı ve birEmfType biçimini belirten numaralandırma Metafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | Stream | AStream bunun için verilerini içerenMetafile. |
| referenceHdc | IntPtr | Bir aygıt bağlamına yönelik bir Windows tanıtıcısı. |
| type | EmfType | BirEmfType bu, format öğesini belirtir.Metafile. |

### Ayrıca bakınız

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* ad alanı [System.Drawing.Imaging](../../metafile)
* toplantı [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

Yeni bir örneğini başlatır[`Metafile`](../../metafile) Belirtilen veri akışından bir sınıf, bir aygıt bağlamına bir Windows tanıtıcısı ve birEmfType biçimini belirten numaralandırma Metafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | Stream | AStream bunun için verilerini içerenMetafile. |
| referenceHdc | IntPtr | Bir aygıt bağlamına yönelik bir Windows tanıtıcısı. |
| frameRect | RectangleF | ARectangle yeniyi sınırlayan dikdörtgeni temsil edenMetafile . |
| frameUnit | MetafileFrameUnit | AMetafileFrameUnit frameRect için ölçü birimini belirtir. |
| type | EmfType | BirEmfType bu, format öğesini belirtir.Metafile. |

### Ayrıca bakınız

* struct [RectangleF](../../../system.drawing/rectanglef)
* enum [MetafileFrameUnit](../../metafileframeunit)
* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* ad alanı [System.Drawing.Imaging](../../metafile)
* toplantı [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
