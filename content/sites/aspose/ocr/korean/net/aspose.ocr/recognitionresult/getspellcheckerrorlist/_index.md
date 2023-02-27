---
title: RecognitionResult.GetSpellCheckErrorList
second_title: .NET API 참조용 Aspose.OCR
description: RecognitionResult 방법. 지정된 입력 텍스트에 대해 제안된 철자로 철자가 틀린 단어를 찾습니다.
type: docs
weight: 110
url: /ko/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

지정된 입력 텍스트에 대해 제안된 철자로 철자가 틀린 단어를 찾습니다.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| language | SpellCheckLanguage | 사용할 사전입니다. |
| dictionaryPath | String | 선택적으로. 사용자 사전(주파수 사전)의 전체 경로입니다. 사전 파일 형식: UTF-8 인코딩의 일반 텍스트 파일. 단어 및 단어 빈도는 공백 또는 탭으로 구분됩니다.기본적으로 단어는 첫 번째 열에, 빈도는 두 번째 열에 있어야 합니다. 모든 단어- 별도의 라인에서 주파수 쌍. 라인은 라인 피드("\n"), 캐리지 리턴("\r"), 또는 캐리지 리턴 바로 뒤에 라인 피드가 오는 일련의 문자로 정의됩니다. ("\r\n"). 모든 단어는 소문자여야 합니다. |

### 반환 값

각 철자가 틀린 단어 에 대한 올바른 철자를 제안하는 목록과 편집 거리가 있는 철자가 틀린 단어를 나타내는 SpellCheckError 개체 목록입니다.

### 또한보십시오

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 네임스페이스 [Aspose.OCR](../../recognitionresult/)
* 집회 [Aspose.OCR](../../../)


