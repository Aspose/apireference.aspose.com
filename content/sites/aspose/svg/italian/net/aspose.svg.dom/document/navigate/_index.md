---
title: Document.Navigate
second_title: Riferimento API Aspose.SVG per .NET
description: Document metodo. Carica il documento allURL Uniform Resource Locator specificato nellistanza corrente sostituendo il contenuto precedente.
type: docs
weight: 1010
url: /it/net/aspose.svg.dom/document/navigate/
---
## Navigate(string) {#navigate_4}

Carica il documento all'URL (Uniform Resource Locator) specificato nell'istanza corrente, sostituendo il contenuto precedente.

```csharp
public void Navigate(string address)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| address | String | L'indirizzo del documento. Verrà combinato con il percorso della directory corrente per formare un URL assoluto. |

### Guarda anche

* class [Document](../)
* spazio dei nomi [Aspose.Svg.Dom](../../document/)
* assemblea [Aspose.SVG](../../../)

---

## Navigate(Url) {#navigate_1}

Carica il documento all'URL (Uniform Resource Locator) specificato nell'istanza corrente, sostituendo il contenuto precedente.

```csharp
public void Navigate(Url url)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | Url | L'URL del documento. |

### Guarda anche

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* spazio dei nomi [Aspose.Svg.Dom](../../document/)
* assemblea [Aspose.SVG](../../../)

---

## Navigate(string, string) {#navigate_6}

Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le relative risorse, sostituendo il contenuto precedente.

```csharp
public void Navigate(string content, string baseUri)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| content | String | Il contenuto del documento. |
| baseUri | String | L'URI di base per risolvere le risorse relative. Verrà combinato con il percorso della directory corrente per formare un URL assoluto. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | `baseUri` È`nullo`. |

### Guarda anche

* class [Document](../)
* spazio dei nomi [Aspose.Svg.Dom](../../document/)
* assemblea [Aspose.SVG](../../../)

---

## Navigate(string, Url) {#navigate_5}

Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le relative risorse, sostituendo il contenuto precedente.

```csharp
public void Navigate(string content, Url baseUri)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| content | String | Il contenuto del documento. |
| baseUri | Url | L'URI di base per risolvere le risorse relative. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | `baseUri` È`nullo`. |

### Guarda anche

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* spazio dei nomi [Aspose.Svg.Dom](../../document/)
* assemblea [Aspose.SVG](../../../)

---

## Navigate(Stream, string) {#navigate_3}

Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le risorse relative, sostituendo il contenuto precedente. Il caricamento del documento inizia dalla posizione corrente nello stream.

```csharp
public void Navigate(Stream content, string baseUri)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| content | Stream | Il contenuto del documento. |
| baseUri | String | L'URI di base per risolvere le risorse relative. Verrà combinato con il percorso della directory corrente per formare un URL assoluto. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | `baseUri` È`nullo`. |

### Guarda anche

* class [Document](../)
* spazio dei nomi [Aspose.Svg.Dom](../../document/)
* assemblea [Aspose.SVG](../../../)

---

## Navigate(Stream, Url) {#navigate_2}

Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le risorse relative, sostituendo il contenuto precedente. Il caricamento del documento inizia dalla posizione corrente nello stream.

```csharp
public void Navigate(Stream content, Url baseUri)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| content | Stream | Il contenuto del documento. |
| baseUri | Url | L'URI di base per risolvere le risorse relative. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | `baseUri` È`nullo`. |

### Guarda anche

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* spazio dei nomi [Aspose.Svg.Dom](../../document/)
* assemblea [Aspose.SVG](../../../)

---

## Navigate(RequestMessage) {#navigate}

Carica il documento in base all'oggetto di richiesta specificato, sostituendo il contenuto precedente.

```csharp
public void Navigate(RequestMessage request)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| request | RequestMessage | L'oggetto richiesta utilizzato per caricare il contenuto del documento. |

### Guarda anche

* class [RequestMessage](../../../aspose.svg.net/requestmessage/)
* class [Document](../)
* spazio dei nomi [Aspose.Svg.Dom](../../document/)
* assemblea [Aspose.SVG](../../../)


