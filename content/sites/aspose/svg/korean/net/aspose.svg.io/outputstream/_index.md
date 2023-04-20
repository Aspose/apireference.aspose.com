---
title: Class OutputStream
second_title: .NET API 참조용 Aspose.SVG
description: Aspose.Svg.IO.OutputStream 수업. 서로게이트 스트림은 실제 출력 스트림을 래핑하고 이에 대한 액세스를 제어합니다. OutputStream 출력 스트림의 위치를 설명하는 URI 데이터를 포함합니다.
type: docs
weight: 1980
url: /ko/net/aspose.svg.io/outputstream/
---
## OutputStream class

서로게이트 스트림은 실제 출력 스트림을 래핑하고 이에 대한 액세스를 제어합니다. `OutputStream` 출력 스트림의 위치를 설명하는 URI 데이터를 포함합니다.

```csharp
public class OutputStream : Stream
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [OutputStream](outputstream/)(Stream, string) | 의 새 인스턴스를 초기화합니다.`OutputStream` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| override [CanRead](../../aspose.svg.io/outputstream/canread/) { get; } | 래핑된 출력 스트림이 읽기를 지원하는지 여부를 나타내는 값을 가져옵니다. |
| override [CanSeek](../../aspose.svg.io/outputstream/canseek/) { get; } | 래핑된 출력 스트림이 검색을 지원하는지 여부를 나타내는 값을 가져옵니다. |
| override [CanWrite](../../aspose.svg.io/outputstream/canwrite/) { get; } | 래핑된 출력 스트림이 쓰기를 지원하는지 여부를 나타내는 값을 가져옵니다. |
| override [Length](../../aspose.svg.io/outputstream/length/) { get; } | 래핑된 출력 스트림의 바이트 길이를 가져옵니다. |
| override [Position](../../aspose.svg.io/outputstream/position/) { get; set; } | 래핑된 출력 스트림 내의 위치를 가져오거나 설정합니다. |
| [Uri](../../aspose.svg.io/outputstream/uri/) { get; } | 스트림 위치의 URI를 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| override [Close](../../aspose.svg.io/outputstream/close/)() | 래핑된 출력 스트림과 현재 스트림을 닫습니다. |
| override [Flush](../../aspose.svg.io/outputstream/flush/)() | 래핑된 출력 스트림에 대한 모든 버퍼를 지우고 버퍼링된 데이터가 기본 장치에 기록되도록 합니다. |
| override [Read](../../aspose.svg.io/outputstream/read/)(byte[], int, int) | 래핑된 출력 stream 에서 바이트 시퀀스를 읽고 읽은 바이트 수만큼 스트림 내의 위치를 이동합니다. |
| override [Seek](../../aspose.svg.io/outputstream/seek/)(long, SeekOrigin) | 래핑된 출력 스트림 내의 위치를 설정합니다. |
| override [SetLength](../../aspose.svg.io/outputstream/setlength/)(long) | 래핑된 출력 스트림의 길이를 설정합니다. |
| override [Write](../../aspose.svg.io/outputstream/write/)(byte[], int, int) | 래핑된 output 스트림에 바이트 시퀀스를 쓰고 이 스트림 내의 현재 위치를 쓰여진 바이트 수만큼 앞으로 이동합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Svg.IO](../../aspose.svg.io/)
* 집회 [Aspose.SVG](../../)


