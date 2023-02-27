---
title: AsposeOcr.GetRectangles
second_title: .NET API 참조용 Aspose.OCR
description: AsposeOcr 방법. 이미지에서 텍스트 영역을 감지합니다.  자동 이미지 왜곡 보정이 적용되지 않습니다. GIF PNG JPEG BMP TIFF JFIF를 지원합니다.
type: docs
weight: 70
url: /ko/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

이미지에서 텍스트 영역을 감지합니다.  자동 이미지 왜곡 보정이 적용되지 않습니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullPath | String | 이미지의 경로입니다. |
| areasType | AreasType | 반환할 사각형(행 또는 단락)을 결정합니다. |
| detectAreas | Boolean | 자동 텍스트 영역 감지를 활성화합니다. |

### 반환 값

감지된 텍스트 영역 또는 줄 목록입니다.

### 또한보십시오

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

이미지에서 텍스트 영역을 감지합니다.  자동 이미지 왜곡 보정이 적용되지 않습니다. GIF, PNG, JPEG, BMP, TIFF, JFIF를 지원합니다.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| image | MemoryStream | 이미지를 포함하는 메모리 스트림. |
| areasType | AreasType | 반환할 사각형(행 또는 단락)을 결정합니다. |
| detectAreas | Boolean | 자동 텍스트 영역 감지를 활성화합니다. |

### 반환 값

감지된 텍스트 영역 또는 줄 목록입니다.

### 또한보십시오

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* 네임스페이스 [Aspose.OCR](../../asposeocr/)
* 집회 [Aspose.OCR](../../../)


