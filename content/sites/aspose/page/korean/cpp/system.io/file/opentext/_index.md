---
title: "System::IO::File::OpenText 메서드"
linktitle: "OpenText"
second_title: "C++용 Aspose.Page"
description: "System::IO::File::OpenText 메서드. 지정된 기존 파일을 UTF-8 인코딩을 사용하여 텍스트를 읽기 위해 C++에서 공유 없이 엽니다."
type: docs
weight: 2100
url: /ko/cpp/system.io/file/opentext/
---
## File::OpenText method


지정된 기존 파일을 UTF-8 인코딩을 사용하여 텍스트를 읽기 위해 공유 없이 엽니다.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 열 파일의 경로 |
| encoding | const EncodingPtr\& | 사용할 문자 인코딩 |

### ReturnValue

열린 파일과 연결된 [StreamWriter](../../streamwriter/) 객체에 대한 공유 포인터

## 또 보기

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
