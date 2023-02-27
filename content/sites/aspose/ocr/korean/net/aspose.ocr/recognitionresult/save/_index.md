---
title: RecognitionResult.Save
second_title: .NET API 참조용 Aspose.OCR
description: RecognitionResult 방법. 문서를 일반 텍스트 PDF 또는 Microsoft Word 문서로 저장합니다.
type: docs
weight: 130
url: /ko/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

문서를 일반 텍스트, PDF 또는 Microsoft Word 문서로 저장합니다.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| fullFileName | String | 선택한 형식으로 인식 결과를 저장하기 위한 경로가 포함된 파일 이름입니다. |
| saveFormat | SaveFormat | 문서 형식(Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | 인식 결과에 맞춤법이 틀린 단어가 있는 경우 맞춤법이 틀린 단어를 수정하려면 true로 설정하세요. |
| language | SpellCheckLanguage | 맞춤법 검사용 사전(선택 사항). |
| dictionaryPath | String | 선택적으로. .txt 형식의 사용자 사전에 대한 전체 경로입니다. 형식은 [단어 - 공백 - 빈도(숫자)]. 입니다. 예: 23135851162\n3400031103\n |

### 또한보십시오

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 네임스페이스 [Aspose.OCR](../../recognitionresult/)
* 집회 [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

문서를 일반 텍스트, PDF 또는 Microsoft Word 문서로 저장합니다.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | 선택한 형식으로 인식 결과를 저장하기 위한 MemoryStream. |
| saveFormat | SaveFormat | 문서 형식(Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | 인식 결과에 맞춤법이 틀린 단어가 있는 경우 맞춤법이 틀린 단어를 수정하려면 true로 설정하세요. |
| language | SpellCheckLanguage | 맞춤법 검사용 사전(선택 사항). |
| dictionaryPath | String | 선택적으로. .txt 형식의 사용자 사전에 대한 전체 경로입니다. 형식은 [단어 - 공백 - 빈도(숫자)]. 입니다. 예: 23135851162\n3400031103\n |

### 또한보십시오

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 네임스페이스 [Aspose.OCR](../../recognitionresult/)
* 집회 [Aspose.OCR](../../../)


