---
title: "System::IO::BinaryWriter::BinaryWriter 생성자"
linktitle: "BinaryWriter"
second_title: "C++용 Aspose.Page"
description: "System::IO::BinaryWriter::BinaryWriter 생성자. C++에서 지정된 인코딩을 사용하여 지정된 스트림에 데이터를 쓰는 BinaryWriter 클래스의 인스턴스를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


지정된 인코딩을 사용하여 지정된 스트림에 데이터를 쓰는 [BinaryWriter](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const StreamPtr\& | 출력 스트림 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |
| leaveopen | bool | 현재 객체가 폐기된 후 스트림 **stream**을 열어 둬야 하는지 여부를 지정합니다 (true). 열어 두지 않아야 하면 (false). |

## 또 보기

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
