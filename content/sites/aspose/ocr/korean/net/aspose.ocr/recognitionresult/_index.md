---
title: Class RecognitionResult
second_title: .NET API 참조용 Aspose.OCR
description: Aspose.OCR.RecognitionResult 수업. 이미지 인식 결과입니다. 결과 내보내기를 위한 인식 정보 및 방법이 있는 요소를 포함합니다.
type: docs
weight: 220
url: /ko/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

이미지 인식 결과입니다. 결과 내보내기를 위한 인식 정보 및 방법이 있는 요소를 포함합니다.

```csharp
public class RecognitionResult
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | PDF 생성을 위한 이미지를 가져오거나 설정합니다. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | 사각형 좌표를 가져옵니다. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | 영역 목록(사각형)의 목록 인식 결과를 가져옵니다. |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | 인식 알고리즘에 의해 발견되고 확률의 내림차순으로 정렬된 문자 집합입니다. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | 행 목록(사각형)과 함께 인식 결과 목록을 가져옵니다. |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | 인식 결과를 하나의 문자열로 가져옵니다. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | 기울이기 각도를 가져옵니다. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | 생성 중에 나타난 중요하지 않은 결함을 설명하는 경고 메시지 목록을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | 인식 결과가 포함된 JSON 문자열을 형성합니다. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | 텍스트를 수정합니다(철자가 틀린 단어 교체). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | 지정된 입력 텍스트에 대해 제안된 철자로 철자가 틀린 단어를 찾습니다. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | 인식 결과가 포함된 양식 XML 문자열. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | 문서를 일반 텍스트, PDF 또는 Microsoft Word 문서로 저장합니다. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | 문서를 일반 텍스트, PDF 또는 Microsoft Word 문서로 저장합니다. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | 인식된 조각(선)에서 전체 결과를 완성하려면. |

## 다른 멤버들

| 이름 | 설명 |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | 행 좌표가 있는 행에서 텍스트를 인식했습니다. |

### 또한보십시오

* 네임스페이스 [Aspose.OCR](../../aspose.ocr/)
* 집회 [Aspose.OCR](../../)


