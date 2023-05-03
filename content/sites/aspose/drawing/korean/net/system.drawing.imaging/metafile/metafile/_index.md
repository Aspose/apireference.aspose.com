---
title: Metafile.Metafile
second_title: .NET API 참조용 Aspose.Drawing
description: Metafile 건설자. 의 새 인스턴스를 초기화합니다.Metafile 지정된 handle. 의 클래스
type: docs
weight: 10
url: /ko/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

의 새 인스턴스를 초기화합니다.[`Metafile`](../) 지정된 handle. 의 클래스

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| henhmetafile | IntPtr | 향상된 메타파일에 대한 핸들입니다. |
| deleteEmf | Boolean | 향상된 메타파일 핸들을 삭제하려면 true입니다. when theMetafile 삭제되었습니다. 그렇지 않으면 거짓입니다. |

### 또한보십시오

* class [Metafile](../)
* 네임스페이스 [System.Drawing.Imaging](../../metafile/)
* 집회 [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

의 새 인스턴스를 초기화합니다.[`Metafile`](../) 장치 컨텍스트 에 대한 지정된 핸들의 클래스 및EmfType형식을 지정하는 열거형Metafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| referenceHdc | IntPtr | 장치 컨텍스트에 대한 핸들입니다. |
| emfType | EmfType | 안EmfType 의 형식을 지정하는Metafile. |

### 또한보십시오

* enum [EmfType](../../emftype/)
* class [Metafile](../)
* 네임스페이스 [System.Drawing.Imaging](../../metafile/)
* 집회 [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

의 새 인스턴스를 초기화합니다.[`Metafile`](../) 지정된 파일 이름의 클래스.

```csharp
public Metafile(string filename)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| filename | String | ㅏString 새 파일을 생성할 파일 이름 를 나타냅니다.Metafile. |

### 또한보십시오

* class [Metafile](../)
* 네임스페이스 [System.Drawing.Imaging](../../metafile/)
* 집회 [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

의 새 인스턴스를 초기화합니다.[`Metafile`](../) 지정된 파일 이름의 클래스.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| filename | String | ㅏString 새 파일을 생성할 파일 이름 를 나타냅니다.Metafile. |
| referenceHdc | IntPtr | 장치 컨텍스트에 대한 Windows 핸들입니다. |

### 또한보십시오

* class [Metafile](../)
* 네임스페이스 [System.Drawing.Imaging](../../metafile/)
* 집회 [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

의 새 인스턴스를 초기화합니다.[`Metafile`](../) 지정된 데이터 스트림의 클래스.

```csharp
public Metafile(Stream stream)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | Stream | 그만큼Stream create 에서 새로운Metafile. |

### 또한보십시오

* class [Metafile](../)
* 네임스페이스 [System.Drawing.Imaging](../../metafile/)
* 집회 [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

의 새 인스턴스를 초기화합니다.[`Metafile`](../) 지정된 데이터 스트림의 클래스 및 디바이스 컨텍스트에 대한 Windows 핸들. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | Stream | ㅏStream for 이 데이터를 포함하는Metafile. |
| referenceHdc | IntPtr | 장치 컨텍스트에 대한 Windows 핸들Metafile 물체. |

### 또한보십시오

* class [Metafile](../)
* 네임스페이스 [System.Drawing.Imaging](../../metafile/)
* 집회 [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

의 새 인스턴스를 초기화합니다.[`Metafile`](../) 지정된 데이터 스트림의 클래스, 장치 컨텍스트에 대한 Windows 핸들 및EmfType enumeration 형식을 지정하는Metafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | Stream | ㅏStream for 이 데이터를 포함하는Metafile. |
| referenceHdc | IntPtr | 장치 컨텍스트에 대한 Windows 핸들입니다. |
| type | EmfType | 안EmfType format 를 지정하는Metafile. |

### 또한보십시오

* enum [EmfType](../../emftype/)
* class [Metafile](../)
* 네임스페이스 [System.Drawing.Imaging](../../metafile/)
* 집회 [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

의 새 인스턴스를 초기화합니다.[`Metafile`](../) 지정된 데이터 스트림의 클래스, 장치 컨텍스트에 대한 Windows 핸들 및EmfType enumeration 형식을 지정하는Metafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | Stream | ㅏStream for 이 데이터를 포함하는Metafile. |
| referenceHdc | IntPtr | 장치 컨텍스트에 대한 Windows 핸들입니다. |
| frameRect | RectangleF | ㅏRectangle 새 항목을 경계로 하는 사각형을 나타냅니다.Metafile . |
| frameUnit | MetafileFrameUnit | ㅏMetafileFrameUnit frameRect의 측정 단위를 지정합니다. |
| type | EmfType | 안EmfType format 를 지정하는Metafile. |

### 또한보십시오

* struct [RectangleF](../../../system.drawing/rectanglef/)
* enum [MetafileFrameUnit](../../metafileframeunit/)
* enum [EmfType](../../emftype/)
* class [Metafile](../)
* 네임스페이스 [System.Drawing.Imaging](../../metafile/)
* 집회 [Aspose.Drawing](../../../)


