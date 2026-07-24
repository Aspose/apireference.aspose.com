---
title: "System::Net::Http::ByteArrayContent 클래스"
linktitle: "ByteArrayContent"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::ByteArrayContent 클래스. HTTP 콘텐츠를 바이트 배열로 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


HTTP 콘텐츠를 바이트 배열로 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | RTTI 정보. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | 새 인스턴스를 생성합니다. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | 바이트 배열 길이를 계산하려고 시도합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | 기본 인코딩입니다. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | 최대 바이트 수입니다. |
## 또 보기

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
