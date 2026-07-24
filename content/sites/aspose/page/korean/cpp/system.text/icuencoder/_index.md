---
title: "System::Text::ICUEncoder 클래스"
linktitle: "ICUEncoder"
second_title: "C++용 Aspose.Page"
description: "System::Text::ICUEncoder 클래스. ICU를 사용하여 인코딩하는 인코더입니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++ 함수의 인자로 전달하십시오."
type: docs
weight: 2100
url: /ko/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | 문자를 바이트로 변환합니다. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | 문자를 바이트로 변환합니다. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | 버퍼를 인코딩하는 데 필요한 바이트 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | 버퍼를 인코딩하는 데 필요한 바이트 수를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | 버퍼를 인코딩한 결과 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | 버퍼를 인코딩한 결과 바이트를 가져옵니다. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | 생성자. |
| virtual [Reset](./reset/)() | 내부 변수를 초기 상태로 설정합니다. |
| [~ICUEncoder](./~icuencoder/)() | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 유형. |
## 또 보기

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
