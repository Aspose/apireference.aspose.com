---
title: "System::Security::Cryptography::HashAlgorithm 클래스"
linktitle: "HashAlgorithm"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::HashAlgorithm 클래스. 해시 알고리즘의 기본 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 1600
url: /ko/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


해시 알고리즘의 기본 클래스. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | 버퍼를 해시합니다. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | 버퍼 슬라이스를 해시합니다. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | 스트림을 끝까지 읽고 읽은 데이터에 대한 해시를 계산합니다. |
| static [Create](./create/)(const String\&) | 이름을 기반으로 해시 알고리즘을 생성합니다. |
| virtual [get_Hash](./get_hash/)() | 계산된 해시 코드의 값을 가져옵니다. |
| virtual [get_HashSize](./get_hashsize/)() | 계산된 해시 값의 크기를 바이트 단위로 가져옵니다. |
| [get_InputBlockSize](./get_inputblocksize/)() override | 입력 블록 크기. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | 출력 블록 크기. |
| virtual [Initialize](./initialize/)() | 해시 함수를 초기 상태로 재설정합니다. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | 데이터 블록을 처리하고 데이터를 출력 배열에 복사합니다. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | 마지막 데이터 블록을 처리하고 해시를 계산합니다. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | 소멸자. |
## 또 보기

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
