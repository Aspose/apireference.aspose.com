---
title: "System::Runtime::InteropServices::Marshal 클래스"
linktitle: "Marshal"
second_title: "C++용 Aspose.Page"
description: "System::Runtime::InteropServices::Marshal 클래스. 마샬링 구현을 제공합니다. C++ 측에서 관리 코드를 지원하지 않기 때문에 번역된 코드와의 호환성을 위해서만 사용됩니다. 이 클래스는 인스턴스 서비스를 제공하지 않는 정적 타입입니다. C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 100
url: /ko/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


마샬링 구현을 제공합니다. 번역된 코드와의 호환성을 위해서만 사용되며, C++ 측에서는 관리 코드를 지원하지 않습니다. 이는 인스턴스 서비스를 갖지 않는 정적 타입입니다. 어떠한 방법으로도 해당 타입의 인스턴스를 생성해서는 안 됩니다.

```cpp
class Marshal
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | 관리되지 않는 메모리를 할당합니다. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | 관리되지 않는 메모리를 할당합니다. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) 의미를 구현합니다. |
| static [Copy](./copy/)(const void *, container\&&, int, int) | public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) 의미를 구현합니다. |
| static [Copy](./copy/)(const container\&, int, void *, int) | public static void Copy(char[] source, int startIndex, IntPtr destination, int length) 의미를 구현합니다. |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | public static void Copy(char[] source, int startIndex, IntPtr destination, int length) 의미를 구현합니다. |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | 관리되지 않는 메모리를 해제합니다. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | 예외에서 HResult를 가져옵니다. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | 관리되지 않는 널 종료 UTF8 문자열에서 관리되는 [String](../../system/string/)을 생성합니다. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | 관리되지 않는 UTF8 문자열에서 관리되는 [String](../../system/string/)을 생성합니다. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | 관리되지 않는 널 종료 문자열에서 관리되는 [String](../../system/string/)을 생성합니다. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | 관리되지 않는 문자열에서 관리되는 [String](../../system/string/)을 생성합니다. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | 관리되지 않는 널 종료 유니코드 문자열에서 관리되는 [String](../../system/string/)을 생성합니다. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | 관리되지 않는 유니코드 문자열에서 관리되는 [String](../../system/string/)을 생성합니다. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | 관리되지 않는 널 종료 UTF8 문자열에서 관리되는 [String](../../system/string/)을 생성합니다. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | 관리되지 않는 UTF8 문자열에서 관리되는 [String](../../system/string/)을 생성합니다. |
| static [ReadByte](./readbyte/)(IntPtr, int) | 메모리에서 바이트를 읽습니다. |
| static [ReadInt16](./readint16/)(IntPtr, int) | 메모리에서 short를 읽습니다. |
| static [ReadInt32](./readint32/)(IntPtr, int) | 메모리에서 int를 읽습니다. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | 지정된 보안 문자열의 내용을 비관리 메모리로 복사하고 ANSI 형식으로 변환합니다. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | 지정된 보안 문자열의 내용을 비관리 메모리로 복사합니다. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | 지정된 문자열의 내용을 비관리 메모리로 복사합니다. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | 필요한 경우 ANSI 형식으로 변환하면서 지정된 문자열의 내용을 비관리 메모리로 복사합니다. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | 지정된 문자열의 내용을 비관리 메모리로 복사합니다. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | 바이트를 메모리에 씁니다. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | 바이트를 메모리에 씁니다. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | short를 메모리에 씁니다. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | int를 메모리에 씁니다. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | long을 메모리에 씁니다. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | SecureStringToGlobalAllocAnsi 메서드를 사용하여 할당된 비관리 문자열 포인터를 해제합니다. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | SecureStringToGlobalAllocUnicode 메서드를 사용하여 할당된 비관리 문자열 포인터를 해제합니다. |
## 또 보기

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Page for C++](../../)
