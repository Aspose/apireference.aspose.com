---
title: "System::IO::File::ReadAllLines 메서드"
linktitle: "ReadAllLines"
second_title: "C++용 Aspose.Page"
description: "System::IO::File::ReadAllLines 메서드. 지정된 텍스트 파일의 내용을 지정된 문자 인코딩을 사용하여 C++에서 줄별로 읽어 문자열 배열에 저장합니다."
type: docs
weight: 2400
url: /ko/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


지정된 텍스트 파일의 내용을 지정된 문자 인코딩을 사용하여 줄마다 문자열 배열로 읽어들입니다.

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 읽을 파일의 경로 |
| encoding | const EncodingPtr\& | 사용할 문자 인코딩 |

### ReturnValue

각 요소가 지정된 파일의 단일 줄을 나타내는 문자열 배열

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
