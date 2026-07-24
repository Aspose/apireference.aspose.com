---
title: "System::Security::Cryptography::CryptoStream 클래스"
linktitle: "CryptoStream"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::CryptoStream 클래스. 기존 스트림을 암호화 기능으로 감싸는 스트림 구현입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 500
url: /ko/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


기존 스트림을 암호화 기능으로 감싸는 스트림 구현입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class CryptoStream : public System::IO::Stream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 연결을 닫습니다. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | 생성자. |
| [Flush](./flush/)() override | 버퍼를 감싼 스트림으로 비웁니다. 변환 알고리즘이 아직 더 많은 데이터를 기다리고 있을 수 있으므로 아무 작업도 수행하지 않습니다. |
| [FlushFinalBlock](./flushfinalblock/)() | 버퍼에 남아 있는 데이터를 스트림에 씁니다. |
| [get_CanRead](./get_canread/)() const override | 스트림이 읽기 가능한지 확인합니다. |
| [get_CanSeek](./get_canseek/)() const override | 스트림이 탐색 가능한지 확인합니다. |
| [get_CanWrite](./get_canwrite/)() const override | 스트림이 쓰기 가능한지 확인합니다. |
| [get_Length](./get_length/)() const override | 스트림의 길이를 가져옵니다. 지원되지 않음. |
| [get_Position](./get_position/)() const override | 스트림의 현재 위치를 가져옵니다. 지원되지 않음. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 데이터를 읽습니다. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 데이터를 읽습니다. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 스트림에서 위치를 탐색합니다. 지원되지 않음. |
| [set_Position](./set_position/)(int64_t) override | 스트림에서 위치를 탐색합니다. 지원되지 않음. |
| [SetLength](./setlength/)(int64_t) override | 스트림의 크기를 탐색합니다. 지원되지 않음. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 스트림에 데이터를 씁니다. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 스트림에 데이터를 씁니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 기본 저장소가 없는 스트림입니다. |
## 또 보기

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
