---
title: "System::Web::Services::Protocols::SoapMessage class"
linktitle: "SoapMessage"
second_title: "Aspose.Page för C++"
description: "System::Web::Services::Protocols::SoapMessage class. Representerar SOAP‑meddelandet. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 1000
url: /sv/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


Representerar SOAP‑meddelandet. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för för att skicka den till funktioner som argument.

```cpp
class SoapMessage : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | Ställer in den interna samlingen av SOAP‑huvuden. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | Hitta huvudmappningen efter angiven huvudtyp. |
| virtual [get_Action](./get_action/)() | Returnerar ett värde för attributet 'SOAPAction'. |
| [get_ContentEncoding](./get_contentencoding/)() | Hämtar ett värde för 'Content-Encoding'-huvudet. |
| [get_ContentType](./get_contenttype/)() | Hämtar ett värde av rubriken 'Content-Type'. |
| [get_Exception](./get_exception/)() | Hämtar undantaget som kastas av XML [Web](../../system.web/) servicemetoden. |
| [get_Headers](./get_headers/)() | Returnerar samlingen av SOAP‑huvuden. |
| [get_InParameters](./get_inparameters/)() | Hämtar parametrarna som skickas in i XML [Web](../../system.web/) servicemetoden. |
| [get_IsSoap12](./get_issoap12/)() | Returnerar ett värde som indikerar om SOAP‑version 1.2 används. |
| [get_OutParameters](./get_outparameters/)() | Hämtar utdata‑parametrarna som skickas in i XML [Web](../../system.web/) servicemetoden. |
| virtual [get_SoapVersion](./get_soapversion/)() | Returnerar den SOAP‑version som används. |
| [get_Stage](./get_stage/)() | Hämtar bearbetningsstadiet för ett SOAP‑meddelande. |
| [get_Stream](./get_stream/)() | Hämtar strömmen som innehåller SOAP‑meddelandedata. |
| virtual [get_Url](./get_url/)() | Returnerar XML [Web](../../system.web/) tjänste‑URL. |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | Hämtar inparametervärdet på det angivna indexet. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | Hämtar utparametervärdet på det angivna indexet. |
| [GetReturnValue](./getreturnvalue/)() | Hämtar returvärdet för XML [Web](../../system.web/) servicemetoden. |
| [set_ContentEncoding](./set_contentencoding/)(String) | Ställer in ett värde för rubriken 'Content-Encoding'. |
| [set_ContentType](./set_contenttype/)(String) | Sätter ett värde för rubriken 'Content-Type'. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Ställer in parametrarna som skickas in i XML [Web](../../system.web/) servicemetoden. |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | Ställer in strömmen som innehåller SOAP‑meddelandedata. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Ställer in utdata‑parametrarna som skickas in i XML [Web](../../system.web/) servicemetoden. |
| [SetException](./setexception/)(SoapException) | Ställer in undantaget som kastas av XML [Web](../../system.web/) servicemetoden. |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | Ställer in samlingen av SOAP‑huvuden. |
| [SetStage](./setstage/)(SoapMessageStage) | Ställer in bearbetningsstadiet för SOAP‑meddelandet. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | Ställer in strömmen som innehåller SOAP‑meddelandedata. |
| [SoapMessage](./soapmessage/)() | Skapar en ny instans. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | Uppdaterar den interna samlingen av SOAP‑huvuden. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
