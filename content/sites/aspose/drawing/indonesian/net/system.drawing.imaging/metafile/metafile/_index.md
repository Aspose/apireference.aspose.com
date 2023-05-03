---
title: Metafile.Metafile
second_title: Aspose.Drawing untuk Referensi .NET API
description: Metafile konstruktor. Menginisialisasi instance baru dariMetafile kelas dari pegangan yang ditentukan.
type: docs
weight: 10
url: /id/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

Menginisialisasi instance baru dari[`Metafile`](../) kelas dari pegangan yang ditentukan.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| henhmetafile | IntPtr | Pegangan ke metafile yang disempurnakan. |
| deleteEmf | Boolean | true untuk menghapus pegangan metafile yang disempurnakan when theMetafile dihapus; jika tidak, salah. |

### Lihat juga

* class [Metafile](../)
* ruang nama [System.Drawing.Imaging](../../metafile/)
* perakitan [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

Menginisialisasi instance baru dari[`Metafile`](../) kelas dari pegangan yang ditentukan ke konteks perangkat danEmfTypepencacahan yang menentukan format dariMetafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| referenceHdc | IntPtr | Pegangan ke konteks perangkat. |
| emfType | EmfType | SebuahEmfType yang menentukan format dariMetafile. |

### Lihat juga

* enum [EmfType](../../emftype/)
* class [Metafile](../)
* ruang nama [System.Drawing.Imaging](../../metafile/)
* perakitan [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

Menginisialisasi instance baru dari[`Metafile`](../) kelas dari nama file yang ditentukan.

```csharp
public Metafile(string filename)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| filename | String | AString yang mewakili nama file untuk membuat yang baruMetafile. |

### Lihat juga

* class [Metafile](../)
* ruang nama [System.Drawing.Imaging](../../metafile/)
* perakitan [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

Menginisialisasi instance baru dari[`Metafile`](../) kelas dari nama file yang ditentukan.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| filename | String | AString yang mewakili nama file untuk membuat yang baruMetafile. |
| referenceHdc | IntPtr | Pegangan Windows ke konteks perangkat. |

### Lihat juga

* class [Metafile](../)
* ruang nama [System.Drawing.Imaging](../../metafile/)
* perakitan [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

Menginisialisasi instance baru dari[`Metafile`](../) kelas dari aliran data yang ditentukan.

```csharp
public Metafile(Stream stream)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | Stream | ItuStream dari mana membuat yang baruMetafile. |

### Lihat juga

* class [Metafile](../)
* ruang nama [System.Drawing.Imaging](../../metafile/)
* perakitan [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

Menginisialisasi instance baru dari[`Metafile`](../) kelas dari aliran data yang ditentukan dan pegangan Windows ke konteks perangkat. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | Stream | AStream yang berisi data untuk iniMetafile. |
| referenceHdc | IntPtr | Pegangan Windows ke konteks perangkat dariMetafile obyek. |

### Lihat juga

* class [Metafile](../)
* ruang nama [System.Drawing.Imaging](../../metafile/)
* perakitan [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

Menginisialisasi instance baru dari[`Metafile`](../) kelas dari aliran data yang ditentukan , pegangan Windows ke konteks perangkat, danEmfType enumeration yang menentukan format fileMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | Stream | AStream yang berisi data untuk iniMetafile. |
| referenceHdc | IntPtr | Pegangan Windows ke konteks perangkat. |
| type | EmfType | SebuahEmfType yang menentukan format dariMetafile. |

### Lihat juga

* enum [EmfType](../../emftype/)
* class [Metafile](../)
* ruang nama [System.Drawing.Imaging](../../metafile/)
* perakitan [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

Menginisialisasi instance baru dari[`Metafile`](../) kelas dari aliran data yang ditentukan , pegangan Windows ke konteks perangkat, danEmfType enumeration yang menentukan format fileMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | Stream | AStream yang berisi data untuk iniMetafile. |
| referenceHdc | IntPtr | Pegangan Windows ke konteks perangkat. |
| frameRect | RectangleF | ARectangle yang mewakili persegi panjang yang membatasi yang baruMetafile . |
| frameUnit | MetafileFrameUnit | AMetafileFrameUnit yang menentukan satuan ukuran untuk frameRect. |
| type | EmfType | SebuahEmfType yang menentukan format dariMetafile. |

### Lihat juga

* struct [RectangleF](../../../system.drawing/rectanglef/)
* enum [MetafileFrameUnit](../../metafileframeunit/)
* enum [EmfType](../../emftype/)
* class [Metafile](../)
* ruang nama [System.Drawing.Imaging](../../metafile/)
* perakitan [Aspose.Drawing](../../../)


