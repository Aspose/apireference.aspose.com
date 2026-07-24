---
title: "Aspose::Page::Plugins::IOperationResult 클래스"
linktitle: "IOperationResult"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Plugins::IOperationResult 클래스. 구체적인 플러그인 작업 결과가 C++에서 구현해야 하는 공통 메서드를 정의하는 일반 작업 결과 인터페이스입니다."
type: docs
weight: 700
url: /ko/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


구체적인 플러그인 작업 결과가 구현해야 하는 공통 메서드를 정의하는 일반 작업 결과 인터페이스입니다.

```cpp
class IOperationResult : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_Data](./get_data/)() | 원시 데이터를 가져옵니다. |
| virtual [get_IsByteArray](./get_isbytearray/)() | 결과가 바이트 배열인지 여부를 나타냅니다. |
| virtual [get_IsFile](./get_isfile/)() | 결과가 출력 파일 경로인지 여부를 나타냅니다. |
| virtual [get_IsStream](./get_isstream/)() | 결과가 출력 스트림인지 여부를 나타냅니다. |
| virtual [get_IsString](./get_isstring/)() | 결과가 텍스트 문자열인지 여부를 나타냅니다. |
| virtual [ToFile](./tofile/)() | 결과를 해당 파일로 변환하려 시도합니다. |
| virtual [ToStream](./tostream/)() | 결과를 스트림 객체로 변환하려고 시도합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
