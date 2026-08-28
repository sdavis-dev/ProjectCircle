# Circle

Circle is a native Android social media application focused on bringing people together through smaller, community-based spaces.

The goal is to create an experience that combines some of the community features found in platforms like Discord with the social discovery and simplicity of platforms like Instagram, while developing a distinct identity and user experience.

## Project Status

🚧 **Early Development**

The project is currently being built from the ground up while learning native Android development with Kotlin and Jetpack Compose.

### Current Progress

* [x] Android Studio project created
* [x] Kotlin fundamentals
* [x] Data classes
* [x] Nullability
* [x] Lists and mutable lists
* [x] Functions and methods
* [x] Companion objects and constants
* [x] Basic Jetpack Compose UI
* [x] Reusable composables
* [x] Circle data displayed through Compose
* [x] `LazyColumn` for Circle lists
* [x] Basic Compose state
* [x] Interactive Join Circle button
* [ ] Member/Join state improvements
* [ ] State hoisting
* [ ] Navigation
* [ ] Circle creation
* [ ] Circle detail screens
* [ ] User profiles
* [ ] Authentication
* [ ] Persistent data
* [ ] Backend integration
* [ ] Real-time features

## Tech Stack

* **Kotlin** — Primary programming language
* **Android Studio** — Development environment
* **Jetpack Compose** — Native Android UI toolkit
* **Material 3** — UI components and design system

Additional technologies will be introduced as the application develops.

## Current Architecture

The project is currently using a simple structure while the Android and Kotlin foundations are being developed.

```text
Circle
│
├── Circle data model
│
├── CircleScreen
│      │
│      └── LazyColumn
│             │
│             └── CircleCard
│
└── Compose state
```

The architecture will evolve as the application gains features and moves toward a production-ready structure.

## Example Circle

A Circle currently contains:

```kotlin
data class Circle(
    val name: String,
    var memberCount: Int = 0,
    val isPrivate: Boolean = false,
    val description: String? = null
)
```

Each Circle can have:

* A name
* A member count
* Public/private visibility
* An optional description

## Learning Goals

This project is also being used as a hands-on learning project for native Android development.

Primary learning goals include:

* Developing proficiency in Kotlin
* Understanding Android application architecture
* Learning Jetpack Compose
* Understanding Compose state and recomposition
* Building reusable UI components
* Learning navigation and screen management
* Working with local and remote data
* Connecting an Android application to a backend
* Implementing authentication
* Building real-time social features

## Long-Term Vision

Circle is intended to become a social platform centered around smaller communities rather than one massive social feed.

Potential features include:

* Private and public Circles
* Circle discovery
* Member management
* Posts and conversations
* Profiles
* Media sharing
* Notifications
* Real-time updates
* Direct messaging
* Circle invitations
* Community moderation

The exact feature set will evolve throughout development.

## Development Philosophy

Circle is being developed incrementally.

Rather than building the entire application at once, each feature will be introduced after understanding the underlying Kotlin and Android concepts required to implement it.

**Learn → Build → Test → Refactor → Expand**

---

## License

This project is currently a personal development project.
