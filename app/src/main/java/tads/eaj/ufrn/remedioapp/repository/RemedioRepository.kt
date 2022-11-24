package tads.eaj.ufrn.remedioapp.repository

import kotlinx.coroutines.flow.Flow
import tads.eaj.ufrn.remedioapp.dao.RemedioDao
import tads.eaj.ufrn.remedioapp.model.Remedio
import javax.inject.Inject

class RemedioRepository @Inject constructor(private val dao: RemedioDao): IRemedioRepository {
    override fun listAll(): Flow<List<Remedio>> {
        return dao.listAll()
    }

    override fun create(remedio: Remedio) {
        return dao.create(remedio)
    }

}