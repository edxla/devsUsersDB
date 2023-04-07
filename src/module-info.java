module com.amazarashi.devsUsersDB {
	//paquetes a exportar para compartirlas
	exports com.devsUsersDB.user.auth;
	// Acceso por Reflexion Opens to para definir modulo solo useApp puede aceder
	opens com.devsUsersDB.user.reflection to com.amazarashi.devsUserApp;
//	exports com.devsUsersDB.user.db;
	
}