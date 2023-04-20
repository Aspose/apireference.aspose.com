---
title: Document.Navigate
second_title: Aspose.SVG voor .NET API-referentie
description: Document methode. Laadt het document op de gespecificeerde Uniform Resource Locator URL in de huidige instantie en vervangt de vorige inhoud.
type: docs
weight: 1010
url: /nl/net/aspose.svg.dom/document/navigate/
---
## Navigate(string) {#navigate_4}

Laadt het document op de gespecificeerde Uniform Resource Locator (URL) in de huidige instantie en vervangt de vorige inhoud.

```csharp
public void Navigate(string address)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| address | String | Het documentadres. Het wordt gecombineerd met het huidige mappad om een absolute URL te vormen. |

### Zie ook

* class [Document](../)
* naamruimte [Aspose.Svg.Dom](../../document/)
* montage [Aspose.SVG](../../../)

---

## Navigate(Url) {#navigate_1}

Laadt het document op de gespecificeerde Uniform Resource Locator (URL) in de huidige instantie en vervangt de vorige inhoud.

```csharp
public void Navigate(Url url)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | Url | De document-URL. |

### Zie ook

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* naamruimte [Aspose.Svg.Dom](../../document/)
* montage [Aspose.SVG](../../../)

---

## Navigate(string, string) {#navigate_6}

Laadt het document vanuit gespecificeerde inhoud en gebruikt baseUri om relatieve bronnen op te lossen, waarbij de vorige inhoud wordt vervangen.

```csharp
public void Navigate(string content, string baseUri)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| content | String | De documentinhoud. |
| baseUri | String | De basis-URI om relatieve bronnen op te lossen. Het wordt gecombineerd met het huidige mappad om een absolute URL te vormen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | `baseUri` is`nul`. |

### Zie ook

* class [Document](../)
* naamruimte [Aspose.Svg.Dom](../../document/)
* montage [Aspose.SVG](../../../)

---

## Navigate(string, Url) {#navigate_5}

Laadt het document vanuit gespecificeerde inhoud en gebruikt baseUri om relatieve bronnen op te lossen, waarbij de vorige inhoud wordt vervangen.

```csharp
public void Navigate(string content, Url baseUri)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| content | String | De documentinhoud. |
| baseUri | Url | De basis-URI om relatieve bronnen op te lossen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | `baseUri` is`nul`. |

### Zie ook

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* naamruimte [Aspose.Svg.Dom](../../document/)
* montage [Aspose.SVG](../../../)

---

## Navigate(Stream, string) {#navigate_3}

Laadt het document vanuit gespecificeerde inhoud en gebruikt baseUri om relatieve bronnen op te lossen, waarbij de vorige inhoud wordt vervangen. Het laden van documenten begint vanaf de huidige positie in de stroom.

```csharp
public void Navigate(Stream content, string baseUri)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| content | Stream | De documentinhoud. |
| baseUri | String | De basis-URI om relatieve bronnen op te lossen. Het wordt gecombineerd met het huidige mappad om een absolute URL te vormen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | `baseUri` is`nul`. |

### Zie ook

* class [Document](../)
* naamruimte [Aspose.Svg.Dom](../../document/)
* montage [Aspose.SVG](../../../)

---

## Navigate(Stream, Url) {#navigate_2}

Laadt het document vanuit gespecificeerde inhoud en gebruikt baseUri om relatieve bronnen op te lossen, waarbij de vorige inhoud wordt vervangen. Het laden van documenten begint vanaf de huidige positie in de stroom.

```csharp
public void Navigate(Stream content, Url baseUri)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| content | Stream | De documentinhoud. |
| baseUri | Url | De basis-URI om relatieve bronnen op te lossen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | `baseUri` is`nul`. |

### Zie ook

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* naamruimte [Aspose.Svg.Dom](../../document/)
* montage [Aspose.SVG](../../../)

---

## Navigate(RequestMessage) {#navigate}

Laadt het document op basis van het opgegeven verzoekobject en vervangt de vorige inhoud.

```csharp
public void Navigate(RequestMessage request)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| request | RequestMessage | Het aanvraagobject dat wordt gebruikt om documentinhoud te laden. |

### Zie ook

* class [RequestMessage](../../../aspose.svg.net/requestmessage/)
* class [Document](../)
* naamruimte [Aspose.Svg.Dom](../../document/)
* montage [Aspose.SVG](../../../)


