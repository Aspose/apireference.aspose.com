---
title: "System::IO::File::ReadLines 메서드"
linktitle: "ReadLines"
second_title: "C++용 Aspose.Page"
description: "System::IO::File::ReadLines 메서드. 지정된 텍스트 파일의 내용을 지정된 문자 인코딩을 사용하여 한 줄씩 읽고, 각 줄을 나타내는 문자열의 열거 가능한 컬렉션을 반환합니다(C++)."
type: docs
weight: 2600
url: /ko/cpp/system.io/file/readlines/
---
## File::ReadLines method


지정된 텍스트 파일의 내용을 지정된 문자 인코딩을 사용하여 줄마다 읽고, 파일 내용의 각 줄을 나타내는 문자열 컬렉션을 열거형으로 반환합니다.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 읽을 파일의 경로 |
| encoding | const EncodingPtr\& | 사용할 문자 인코딩 |

### ReturnValue

지정된 파일의 내용을 나타내는 문자열의 열거 가능한 컬렉션

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
