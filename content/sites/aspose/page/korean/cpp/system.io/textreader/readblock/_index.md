---
title: "System::IO::TextReader::ReadBlock 메서드"
linktitle: "ReadBlock"
second_title: "C++용 Aspose.Page"
description: "System::IO::TextReader::ReadBlock 메서드. 현재 텍스트 리더에서 지정된 최대 문자 수를 읽고, 지정된 인덱스부터 C++에서 버퍼에 데이터를 씁니다."
type: docs
weight: 500
url: /ko/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


현재 텍스트 리더에서 지정된 최대 수의 문자를 읽고, 지정된 인덱스부터 시작하는 버퍼에 데이터를 씁니다.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | ArrayPtr\<char_t\> | 읽은 데이터를 쓸 문자 버퍼 |
| index | int | **buffer**에 쓰기를 시작할 0 기반 인덱스 |
| count | int | 읽을 최대 문자 수 |

### ReturnValue

실제로 읽은 문자 수

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
