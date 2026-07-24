---
title: "System::Net::Http::HttpContent class"
linktitle: "HttpContent"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::HttpContent 클래스. HTTP 엔터티의 내용을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하세요."
type: docs
weight: 400
url: /ko/cpp/system.net.http/httpcontent/
---
## HttpContent class


HTTP 엔터티의 내용을 나타냅니다. 이 클래스의 [Object](../../system/object/)는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하세요.

```cpp
class HttpContent : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Dispose](./dispose/)() override | 현재 인스턴스를 해제합니다. 이 메서드는 'ReadAsStream'이 반환하는 스트림과 생성된 경우 메모리 버퍼도 해제합니다. |
| [get_Headers](./get_headers/)() | HTTP 콘텐츠 헤더를 반환합니다. |
| [LoadIntoBuffer](./loadintobuffer/)() | 내용을 메모리 버퍼에 직렬화합니다. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | 내용을 메모리 버퍼에 직렬화합니다. |
| [ReadAsByteArray](./readasbytearray/)() | 내용을 직렬화하고 바이트 배열을 반환합니다. |
| [ReadAsStream](./readasstream/)() | 내용을 직렬화하고 스트림을 반환합니다. |
| [ReadAsString](./readasstring/)() | 내용을 직렬화하고 문자열을 반환합니다. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | 내용 크기를 계산하려 시도합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | 기본 인코딩입니다. |
| static [MaxBufferSize](./maxbuffersize/) | 최대 바이트 수입니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
