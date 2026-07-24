---
title: "System::IO::File class"
linktitle: "파일"
second_title: "C++용 Aspose.Page"
description: "System::IO::File 클래스. 파일을 조작하는 메서드를 제공합니다. 인스턴스 서비스를 갖지 않는 정적 타입이며, C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1300
url: /ko/cpp/system.io/file/
---
## File class


파일을 조작하는 메서드를 제공합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입입니다. 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다.

```cpp
class File
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | 지정된 인코딩을 사용하여 지정된 문자열 컬렉션의 문자열들을 새 줄에 각각 기록함으로써 지정된 파일에 추가합니다. 지정된 파일이 존재하지 않으면 생성됩니다. 모든 문자열을 기록한 후 파일이 닫힙니다. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | 지정된 인코딩을 사용하여 지정된 문자열을 지정된 파일에 추가합니다. |
| static [AppendText](./appendtext/)(const String\&) | UTF-8 인코딩을 사용하여 지정된 파일에 텍스트를 추가하는 [StreamWriter](../streamwriter/) 객체를 생성합니다. 지정된 파일이 존재하지 않으면 생성됩니다. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | 지정된 파일을 지정된 위치로 복사합니다. 대상 파일이 이미 존재하는 경우, 매개변수를 통해 덮어쓸지 여부를 지정합니다. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | 새 파일을 생성(또는 기존 파일을 덮어쓰기)하고, 지정된 버퍼 크기와 옵션을 사용하여 읽기 및 쓰기 접근으로 엽니다. |
| static [CreateText](./createtext/)(const String\&) | UTF-8 인코딩 텍스트를 쓰기 위해 새 파일을 생성하거나 기존 파일을 엽니다. |
| static [Decrypt](./decrypt/)(const String\&) | 구현되지 않음. |
| static [Delete](./delete/)(const String\&) | 지정된 파일 또는 디렉터리를 삭제합니다. |
| static [Encrypt](./encrypt/)(const String\&) | 구현되지 않음. |
| static [Exists](./exists/)(const String\&) | 지정된 경로가 기존 파일을 가리키는지 확인합니다. |
| static [GetAttributes](./getattributes/)(const String\&) | 지정된 엔터티의 속성을 반환합니다. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | 지정된 엔터티의 생성 시간을 로컬 시간으로 반환합니다. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | 지정된 엔터티의 생성 시간을 UTC 시간으로 반환합니다. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | 지정된 엔터티의 마지막 액세스 시간을 로컬 시간으로 반환합니다. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | 지정된 엔터티의 마지막 액세스 시간을 UTC 시간으로 반환합니다. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | 지정된 엔터티의 마지막 쓰기 시간을 로컬 시간으로 반환합니다. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | 지정된 엔터티의 마지막 쓰기 시간을 UTC 시간으로 반환합니다. |
| static [Move](./move/)(const String\&, const String\&) | 지정된 파일을 새 위치로 이동합니다. |
| static [Open](./open/)(const String\&, FileMode) | 지정된 파일을 지정된 모드로 읽기 및 쓰기용으로 열고 공유를 하지 않습니다. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | 지정된 파일을 지정된 모드와 지정된 액세스 유형 및 공유 옵션으로 엽니다. |
| static [OpenRead](./openread/)(const String\&) | 지정된 파일을 읽기 전용으로, 'Open' 모드에서 읽기 공유 액세스로 엽니다. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | 지정된 기존 파일을 UTF-8 인코딩을 사용하여 텍스트를 읽기 위해 공유 없이 엽니다. |
| static [OpenWrite](./openwrite/)(const String\&) | 지정된 파일을 쓰기 전용으로, 'OpenOrCreate' 모드에서 공유 없이 엽니다. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | 지정된 바이너리 파일의 내용을 바이트 배열로 읽어들입니다. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | 지정된 텍스트 파일의 내용을 지정된 문자 인코딩을 사용하여 줄마다 문자열 배열로 읽어들입니다. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | 지정된 텍스트 파일의 내용을 지정된 문자 인코딩을 사용하여 단일 [String](../../system/string/) 객체로 읽어들입니다. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | 지정된 텍스트 파일의 내용을 지정된 문자 인코딩을 사용하여 줄마다 읽고, 파일 내용의 각 줄을 나타내는 문자열 컬렉션을 열거형으로 반환합니다. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | 한 파일의 내용을 다른 파일로 교체하고 교체된 파일의 백업을 생성합니다. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | 지정된 파일에 지정된 속성을 설정합니다. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | 구현되지 않음. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | 구현되지 않음. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | 구현되지 않음. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | 구현되지 않음. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | 지정된 엔터티의 마지막 쓰기 시간을 로컬 시간으로 설정합니다. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | 지정된 엔터티의 마지막 쓰기 시간을 UTC 시간으로 설정합니다. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | 지정된 바이너리 파일을 덮어쓰고 지정된 바이트를 기록합니다. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | 새 텍스트 파일을 만들거나 기존 파일을 덮어쓰고, 지정된 인코딩을 사용하여 지정된 열거형 문자열 컬렉션의 모든 문자열을 각 줄마다 파일에 기록합니다. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | 새 텍스트 파일을 만들거나 기존 파일을 덮어쓰고, 지정된 인코딩을 사용하여 지정된 문자열 배열의 모든 문자열을 각 줄마다 파일에 기록합니다. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | 새 텍스트 파일을 만들거나 기존 파일을 덮어쓰고, 지정된 인코딩을 사용하여 지정된 문자열의 내용을 파일에 기록합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | 파일을 읽고 쓸 때 버퍼링되는 바이트 수의 기본값입니다. |
## 또 보기

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
