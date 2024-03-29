---
title: DotCodeExtCodetextBuilder
second_title: .NET API 참조용 Aspose.BarCode
description: DotCodeEncodeMode의 ExtendedCodetext 모드용 2D DotCode 바코드용 확장 코드텍스트 생성기
type: docs
weight: 910
url: /ko/net/aspose.barcode.generation/dotcodeextcodetextbuilder/
---
## DotCodeExtCodetextBuilder class

DotCodeEncodeMode의 ExtendedCodetext 모드용 2D DotCode 바코드용 확장 코드텍스트 생성기

```csharp
public class DotCodeExtCodetextBuilder : ExtCodetextBuilder
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DotCodeExtCodetextBuilder](dotcodeextcodetextbuilder/)() | 기본 생성자입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AddECICodetext](../../aspose.barcode.generation/extcodetextbuilder/addecicodetext/)(ECIEncodings, string) | 확장 채널 식별자 로 코드 텍스트를 추가합니다. |
| [AddFNC1FormatIdentifier](../../aspose.barcode.generation/dotcodeextcodetextbuilder/addfnc1formatidentifier/)() | FNC1 형식 식별자를 확장 코드 텍스트 items 에 추가합니다. |
| [AddFNC3ReaderInitialization](../../aspose.barcode.generation/dotcodeextcodetextbuilder/addfnc3readerinitialization/)() | FNC3 판독기 초기화를 확장 코드 텍스트 items 에 추가합니다. |
| [AddFNC3SymbolSeparator](../../aspose.barcode.generation/dotcodeextcodetextbuilder/addfnc3symbolseparator/)() | 확장된 코드 텍스트 items 에 FNC3 기호 구분 기호를 추가합니다. |
| [AddPlainCodetext](../../aspose.barcode.generation/extcodetextbuilder/addplaincodetext/)(string) | 확장된 코드 텍스트 items 에 일반 코드 텍스트를 추가합니다. |
| [AddStructuredAppendMode](../../aspose.barcode.generation/dotcodeextcodetextbuilder/addstructuredappendmode/)(int, int) | 확장된 코드 텍스트 items 에 구조화된 추가 모드를 추가합니다. |
| virtual [Clear](../../aspose.barcode.generation/extcodetextbuilder/clear/)() | 확장 코드 텍스트를 지웁니다. items |
| override [GetExtendedCodetext](../../aspose.barcode.generation/dotcodeextcodetextbuilder/getextendedcodetext/)() | 확장 코드텍스트 목록에서 확장 코드텍스트를 생성합니다. |

### 예

```csharp
[C#]
//확장 코드텍스트 모드
//코드텍스트 생성
DotCodeExtCodetextBuilder textBuilder = new DotCodeExtCodetextBuilder();
textBuilder.AddFNC1FormatIdentifier();
textBuilder.AddECICodetext(ECIEncodings.Win1251, "Will");
textBuilder.AddFNC1FormatIdentifier();
textBuilder.AddECICodetext(ECIEncodings.UTF8, "犬Right狗");
textBuilder.AddFNC1FormatIdentifier();
textBuilder.AddECICodetext(ECIEncodings.UTF16BE, "犬Power狗");
textBuilder.AddPlainCodetext("Plain text");
textBuilder.AddFNC3SymbolSeparator();
textBuilder.AddFNC3ReaderInitialization();
textBuilder.AddPlainCodetext("Reader initialization info");

//코드 텍스트 생성
string codetext = textBuilder.GetExtendedCodetext();    

//생성하다
using(BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DotCode, codetext))
{
    generator.Parameters.Barcode.DotCode.DotCodeEncodeMode = DotCodeEncodeMode.ExtendedCodetext;
	generator.Save("test.bmp");
}
```

### 또한보십시오

* class [ExtCodetextBuilder](../extcodetextbuilder/)
* 네임스페이스 [Aspose.BarCode.Generation](../../aspose.barcode.generation/)
* 집회 [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
