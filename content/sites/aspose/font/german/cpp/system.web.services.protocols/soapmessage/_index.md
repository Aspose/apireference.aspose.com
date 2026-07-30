---
title: "System::Web::Services::Protocols::SoapMessage Klasse"
linktitle: "SoapMessage"
second_title: "Aspose.Font für C++"
description: "System::Web::Services::Protocols::SoapMessage Klasse. Stellt die SOAP‑Nachricht dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() erstellt werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


Stellt die SOAP‑Nachricht dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) erstellt werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SoapMessage : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | Setzt die interne Sammlung der SOAP‑Header. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | Findet die Header‑Zuordnung anhand des angegebenen Header‑Typs. |
| virtual [get_Action](./get_action/)() | Gibt den Wert des 'SOAPAction'-Attributs zurück. |
| [get_ContentEncoding](./get_contentencoding/)() | Ruft einen Wert des 'Content-Encoding'-Headers ab. |
| [get_ContentType](./get_contenttype/)() | Liest einen Wert des 'Content-Type'-Headers. |
| [get_Exception](./get_exception/)() | Liefert die Ausnahme, die von der XML [Web](../../system.web/) Service‑Methode ausgelöst wird. |
| [get_Headers](./get_headers/)() | Gibt die Sammlung der SOAP‑Header zurück. |
| [get_InParameters](./get_inparameters/)() | Liefert die Parameter, die an die XML [Web](../../system.web/) Service‑Methode übergeben werden. |
| [get_IsSoap12](./get_issoap12/)() | Gibt einen Wert zurück, der angibt, ob SOAP‑Version 1.2 verwendet wird. |
| [get_OutParameters](./get_outparameters/)() | Liefert die Ausgabe‑Parameter, die an die XML [Web](../../system.web/) Service‑Methode übergeben werden. |
| virtual [get_SoapVersion](./get_soapversion/)() | Gibt die verwendete SOAP-Version zurück. |
| [get_Stage](./get_stage/)() | Ermittelt die Verarbeitungsstufe einer SOAP-Nachricht. |
| [get_Stream](./get_stream/)() | Ermittelt den Stream, der die SOAP-Nachrichtendaten enthält. |
| virtual [get_Url](./get_url/)() | Gibt die XML [Web](../../system.web/) Service-URL zurück. |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | Ermittelt den Eingabeparameterwert am angegebenen Index. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | Ermittelt den Ausgabeparameterwert am angegebenen Index. |
| [GetReturnValue](./getreturnvalue/)() | Ermittelt den Rückgabewert der XML [Web](../../system.web/) Service-Methode. |
| [set_ContentEncoding](./set_contentencoding/)(String) | Setzt einen Wert des 'Content-Encoding'-Headers. |
| [set_ContentType](./set_contenttype/)(String) | Setzt einen Wert des 'Content-Type'-Headers. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Setzt die Parameter, die an die XML [Web](../../system.web/) Service-Methode übergeben werden. |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | Setzt den Stream, der die SOAP-Nachrichtendaten enthält. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Setzt die Ausgabeparameter, die an die XML [Web](../../system.web/) Service-Methode übergeben werden. |
| [SetException](./setexception/)(SoapException) | Setzt die Ausnahme, die von der XML [Web](../../system.web/) Service-Methode ausgelöst wird. |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | Setzt die Sammlung der SOAP-Header. |
| [SetStage](./setstage/)(SoapMessageStage) | Setzt die Verarbeitungsstufe der SOAP-Nachricht. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | Setzt den Stream, der die SOAP-Nachrichtendaten enthält. |
| [SoapMessage](./soapmessage/)() | Erstellt eine neue Instanz. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | Aktualisiert die interne Sammlung der SOAP-Header. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
