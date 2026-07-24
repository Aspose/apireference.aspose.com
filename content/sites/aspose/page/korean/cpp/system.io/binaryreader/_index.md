---
title: "System::IO::BinaryReader 클래스"
linktitle: "BinaryReader"
second_title: "C++용 Aspose.Page"
description: "System::IO::BinaryReader 클래스. 특정 인코딩으로 원시 데이터 타입을 바이너리 데이터로 읽는 리더를 나타냅니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 800
url: /ko/cpp/system.io/binaryreader/
---
## BinaryReader class


특정 인코딩으로 원시 데이터 타입을 바이너리 데이터로 읽는 리더를 나타냅니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인자로 전달하십시오.

```cpp
class BinaryReader : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | 지정된 스트림에서 데이터를 UTF-8 인코딩으로 읽는 [BinaryReader](./) 클래스의 인스턴스를 생성합니다. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | 지정된 스트림에서 데이터를 지정된 인코딩으로 읽는 [BinaryReader](./) 클래스의 인스턴스를 생성합니다. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | 지정된 스트림에서 데이터를 지정된 인코딩으로 읽는 [BinaryReader](./) 클래스의 인스턴스를 생성합니다. |
| virtual [Close](./close/)() | 현재 [BinaryReader](./) 객체와 기본 입력 스트림을 닫습니다. |
| [Dispose](./dispose/)() override | 현재 객체가 사용한 모든 리소스를 해제하고 기반 스트림을 닫습니다. |
| virtual [get_BaseStream](./get_basestream/)() | 입력 스트림을 반환합니다. |
| virtual [PeekChar](./peekchar/)() | 스트림의 읽기 커서를 변경하지 않고 입력 스트림에서 단일 문자를 읽습니다. |
| virtual [Read](./read/)() | 입력 스트림에서 단일 문자를 읽습니다. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | 입력 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | 입력 스트림에서 지정된 문자 수를 읽고 UTF-16 인코딩으로 변환한 뒤, 지정된 위치에서 시작하는 지정된 문자 배열에 결과 UTF-16 문자를 씁니다. |
| virtual [ReadBoolean](./readboolean/)() | 입력 스트림에서 단일 바이트를 읽고 해당 바이트의 불리언 표현을 반환합니다. |
| virtual [ReadByte](./readbyte/)() | 입력 스트림에서 단일 바이트를 읽습니다. |
| virtual [ReadBytes](./readbytes/)(int) | 입력 스트림에서 지정된 바이트 수를 읽습니다. |
| virtual [ReadChar](./readchar/)() | 입력 스트림에서 단일 문자를 읽습니다. |
| virtual [ReadChars](./readchars/)(int) | 입력 스트림에서 지정된 문자 수를 읽고 UTF-16 인코딩으로 반환합니다. |
| virtual [ReadDecimal](./readdecimal/)() | 구현되지 않음. |
| virtual [ReadDouble](./readdouble/)() | 입력 스트림에서 8바이트를 읽고 이를 배정밀도 부동소수점 값으로 반환합니다. |
| virtual [ReadInt16](./readint16/)() | 입력 스트림에서 2바이트를 읽고 이를 16비트 정수 값으로 반환합니다. |
| virtual [ReadInt32](./readint32/)() | 입력 스트림에서 4바이트를 읽고 이를 32비트 정수 값으로 반환합니다. |
| virtual [ReadInt64](./readint64/)() | 입력 스트림에서 8바이트를 읽고 이를 64비트 정수 값으로 반환합니다. |
| virtual [ReadSByte](./readsbyte/)() | 입력 스트림에서 단일 바이트를 읽고 이를 부호 있는 8비트 정수 값으로 반환합니다. |
| virtual [ReadSingle](./readsingle/)() | 입력 스트림에서 4바이트를 읽고 이를 단정도 부동소수점 값으로 반환합니다. |
| virtual [ReadString](./readstring/)() | 현재 스트림에서 문자열을 읽습니다. 문자열은 길이가 앞에 붙어 있으며, 길이는 7비트씩 인코딩된 정수로 표현됩니다. |
| virtual [ReadUInt16](./readuint16/)() | 입력 스트림에서 2바이트를 읽고 이를 부호 없는 16비트 정수 값으로 반환합니다. |
| virtual [ReadUInt32](./readuint32/)() | 입력 스트림에서 4바이트를 읽고 이를 부호 없는 32비트 정수 값으로 반환합니다. |
| virtual [ReadUInt64](./readuint64/)() | 입력 스트림에서 8바이트를 읽고 이를 부호 없는 64비트 정수 값으로 반환합니다. |
| virtual [~BinaryReader](./~binaryreader/)() | 소멸자. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
